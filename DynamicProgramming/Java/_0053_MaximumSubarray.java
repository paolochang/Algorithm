package DynamicProgramming.Java;

public class _0053_MaximumSubarray {

  public int maxSubArray(int[] nums) {
    int currMax = nums[0];
    int max = nums[0];
    int numsLength = nums.length;
    for (int i = 1; i < numsLength; i++) {
        if (nums[i] > currMax + nums[i])
            currMax = nums[i];
        else
            currMax += nums[i];
        if (currMax > max)
            max = currMax;
    }
    return max;
  }
}
