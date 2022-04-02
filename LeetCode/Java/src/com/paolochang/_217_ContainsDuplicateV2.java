package LeetCode.Java.src.com.paolochang;

import java.util.HashSet;

public class _217_ContainsDuplicateV2 {

  public static void main(String[] args) throws Exception {
    int[] nums1 = {1,2,3,1};
    int[] nums2 = {1,2,3,4};
    int[] nums3 =  {1,1,1,3,3,4,3,2,4,2};
    boolean result1 = containsDuplicate(nums1);
    boolean result2 = containsDuplicate(nums2);
    boolean result3 = containsDuplicate(nums3);
    System.out.println("nums1: " + result1);
    System.out.println("nums2: " + result2);
    System.out.println("nums3: " + result3);
  }

  public static boolean containsDuplicate(int[] nums) {
    boolean isRepeat = false;
    HashSet<Integer> list = new HashSet<Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (list.contains(nums[i])) {
        isRepeat = true;
        break;
      }
      list.add(nums[i]);
    }
    return isRepeat;
  }
}
