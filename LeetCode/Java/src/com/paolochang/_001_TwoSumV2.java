package LeetCode.Java.src.com.paolochang;

import java.util.Arrays;
import java.util.HashMap;

public class _001_TwoSumV2 {

  public static void main(String[] args) throws Exception {
    int[] nums1 = {2,7,11,15};
    int[] nums2 = {3,2,4};
    int[] nums3 = {3,3};
    int[] nums4 = {3,2,3};
    int[] nums5 = {2,4,11,3};
    System.out.println("RESULT [0, 1] == " + Arrays.toString(twoSum(nums1, 9)));
    System.out.println("RESULT [1, 2] == " + Arrays.toString(twoSum(nums2, 6)));
    System.out.println("RESULT [0, 1] == " + Arrays.toString(twoSum(nums3, 6)));
    System.out.println("RESULT [0, 2] == " + Arrays.toString(twoSum(nums4, 6)));
    System.out.println("RESULT [0, 1] == " + Arrays.toString(twoSum(nums5, 6)));
  }

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    int[] result = new int[2]; 
    int need = 0;
    for (int i = 0; i < nums.length; i++) {
      need = target - nums[i];
      if (hashMap.containsValue(need)) {
        result[1] = i;
        break;
      }
      hashMap.put(i, nums[i]);
    }

    for (Integer i : hashMap.keySet()) {
      if (nums[i] == need) result[0] = i;
    }

    return result;
  }
}
