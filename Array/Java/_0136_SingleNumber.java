package Array.Java;

import java.util.HashSet;

public class _0136_SingleNumber {

  /**
   * Iteration: HashSet
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public int singleNumberV1(int[] nums) {
    HashSet<Integer> numSet = new HashSet<>();
    int result = 0;
    for (int num : nums) {
      if (!numSet.contains(num)) numSet.add(num);
      else numSet.remove(num);
    }
    for (int num : numSet) {
      result = num;
    }
    return result;
  }

  /**
   * Iteration: Bit Manipulation XOR
   *    INPUT        OUTPUT
   *  A       B         
   *  0       0         0
   *  1       0         1
   *  0       1         1
   *  1       1         0
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(1)
   */
  public int singleNumberV2(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result ^= num;
    }
    return result;
  }
}
