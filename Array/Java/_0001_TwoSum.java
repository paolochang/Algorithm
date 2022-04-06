package Array.Java;

import java.util.Arrays;
import java.util.HashMap;

public class _0001_TwoSum {

  public static void main(String[] args) throws Exception {
    int[] nums1 = {2,7,11,15};
    int[] nums2 = {3,2,4};
    int[] nums3 = {3,3};
    int[] nums4 = {3,2,3};
    int[] nums5 = {2,4,11,3};
    System.out.println(Arrays.toString(twoSumV2(nums1, 9)));
    System.out.println(Arrays.toString(twoSumV2(nums2, 6)));
    System.out.println(Arrays.toString(twoSumV2(nums3, 6)));
    System.out.println(Arrays.toString(twoSumV2(nums4, 6)));
    System.out.println(Arrays.toString(twoSumV2(nums5, 6)));
  }

  public static int[] twoSumV1(int[] nums, int target) {
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

  public static int[] twoSumV2(int[] nums, int target) throws IllegalAccessException {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (hashMap.containsKey(complement)) {
        return new int[] {hashMap.get(complement), i};
      }
      hashMap.put(nums[i], i);
    }
    throw new IllegalArgumentException("Not found");
  }
}
