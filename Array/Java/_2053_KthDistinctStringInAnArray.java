package Array.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2053_KthDistinctStringInAnArray {

  public static void main(String[] args) throws Exception {
  }

  public String kthDistinctV1(String[] arr, int k) {
    List<String> all = new ArrayList<String>();
    List<String> dist = new ArrayList<String>();
    String str = "";

    for (int i = 0; i < arr.length; i++) {
        if (dist.contains(arr[i]) && all.contains(arr[i])) {
            dist.remove(arr[i]);
        }
        else if (dist.contains(arr[i]) == false && all.contains(arr[i])) {
            continue;
        }
        else {
            dist.add(arr[i]);
            all.add(arr[i]);
        }
    }

    if (dist.size() >= k) {
        str = dist.get(k - 1);
    }

    return str;
  }

  /**
   * Iteration
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(1)
   */
  public String kthDistinctV2(String[] arr, int k) {
    ArrayList<String> v = new ArrayList<>();

    for(String s:arr)
        v.add(s);

    for(String s : v) {
        if(Collections.frequency(v, s) == 1) 
            k--;

        if(k == 0)
            return s;   
    }
    
    return "";
  }
}
