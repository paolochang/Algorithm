package Array.Java;

import java.util.Hashtable;
import java.util.Map;

public class _0169_MajorityElement {

  /**
   * Iteration: Hashtable
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(N)
   */
  public int majorityElement(int[] nums) {
    Hashtable<Integer, Integer> ht = new Hashtable<>();
    
    for (int num : nums) {
      if (ht.containsKey(num)) {
        ht.put(num, ht.get(num) + 1);
      }
      else
        ht.put(num, 1);
    }

    int max = 0;
    int maxKey = -1;
    
    for(Map.Entry<Integer,Integer> m : ht.entrySet()) {
      if (max < m.getValue()) {
        max = m.getValue();
        maxKey = m.getKey();
      };
    }  

   return maxKey;
  }
}
