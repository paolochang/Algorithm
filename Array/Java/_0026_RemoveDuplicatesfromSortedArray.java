package Array.Java;

import java.util.Arrays;

public class _0026_RemoveDuplicatesfromSortedArray {

  public static void main(String[] args) throws Exception {
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    removeDuplicates(nums);
    System.out.println(Arrays.toString(nums));
  }

  /**
   * Iteration
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(N)
   */
  public static int removeDuplicates(int[] nums) {
    int i = 0;
    for (int num : nums) {
      if (i == 0 || num > nums[i-1]) {
        nums[i++] = num;
      }
    }
    return i;
  }
}
