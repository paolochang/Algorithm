package Array.Java;

import java.util.Hashtable;
import java.util.Map;

public class _0169_MajorityElement {

  /**
   * Iteration: Hashtable
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(N)
   */
  public int majorityElementV1(int[] nums) {
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

  /**
   * Boyer-Moor Voting Algorithm
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(1)
   */
  public int majorityElementV2(int[] nums) {
    int count = 0, ret = 0;
    for (int num: nums) {
      if (count == 0)
        ret = num;
      if (num != ret)
        count--;
      else
        count++;
    }
    return ret;
}
}
