package Array.Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _0217_ContainsDuplicate {

  public static void main(String[] args) throws Exception {
    int[] nums1 = {1,2,3,1};
    int[] nums2 = {1,2,3,4};
    int[] nums3 =  {1,1,1,3,3,4,3,2,4,2};
    System.out.println("nums1: " + containsDuplicateV2(nums1));
    System.out.println("nums2: " + containsDuplicateV2(nums2));
    System.out.println("nums3: " + containsDuplicateV2(nums3));
  }

  // O(n)
  public static boolean containsDuplicateV1(int[] nums) {
    boolean isRepeat = false;
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (list.contains(nums[i])) {
        isRepeat = true;
        break;
      }
      list.add(nums[i]);
    }
    return isRepeat;
  }

  // O(n)
  public static boolean containsDuplicateV2(int[] nums) {
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
