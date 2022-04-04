package LeetCode.Java.src.com.paolochang;

import java.util.Arrays;

public class _001_TwoSumV1 {

  public static void main(String[] args) throws Exception {
    int[] nums1 = {2,7,11,15};
    int[] nums2 = {3,2,4};
    int[] nums3 = {3,3};
    int[] nums4 = {3,2,3};
    System.out.println(Arrays.toString(twoSum(nums1, 9)));
    System.out.println(Arrays.toString(twoSum(nums2, 6)));
    System.out.println(Arrays.toString(twoSum(nums3, 6)));
    System.out.println(Arrays.toString(twoSum(nums4, 6)));
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] list = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 1; j < nums.length; j++) {
        if (target == nums[i] + nums[j] && i != j) {
          list[0] = i;
          list[1] = j;
          break;
        }
      }
    }
    return list;
  }
}
