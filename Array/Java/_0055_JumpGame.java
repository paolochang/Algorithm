package Array.Java;

public class _0055_JumpGame {

  /**
   * Iteration: Greedy
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(1)
   */
  public boolean canJump(int[] nums) {
    // count is 1 to set 0 for the initial first loop 
    // at the i index 0, Math.max(count-1) become 0
    int count = 1;
    // i < nums.length - 1, because we need to check 
    // that the second last element is not 0
    for (int i = 0; i < nums.length-1; i++) {
      count = Math.max(count-1, nums[i]);
      if (count == 0) return false;
    }
    return true;
  }
}
