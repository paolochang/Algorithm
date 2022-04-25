package Tree.Java;

public class _0704_BinarySearch {
  public static int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low)/2;
      if (nums[mid] == target) 
        return mid;
      else if (nums[mid] > target) 
        high = mid - 1;
      else 
        low = mid + 1;
    }
    return -1;
  }

  public static void main(String[] args) throws Exception {
    int[] nums1 = {-1,0,3,5,9,12};
    System.out.println(search(nums1, 9));
    System.out.println(search(nums1, 2));

    int[] nums2 = {5};
    System.out.println(search(nums2, 5));
    System.out.println(search(nums2, -5));

    int[] nums3 = {2,5};
    System.out.println(search(nums3, 5));
  }
}
