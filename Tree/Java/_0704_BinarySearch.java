package Tree.Java;

public class _0704_BinarySearch {
  /**
   * Iterative a.k.a Binary Search
   * Time Complexity: BigO(logN)
   * Space Complexity: BigO(1)
   */
  public static int searchV1(int[] nums, int target) {
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

  /**
   * Recursion
   * Time Complexity: BigO(logN)
   * Space Complexity: BigO(logN)
   */
  public static int searchV2(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    return recursive(nums, low, high, target);
  }

  public static int recursive(int[] nums, int low, int high, int target) {
    if(low > high) return -1;
    int mid = (low + high) / 2;
    
    if(nums[mid] == target) return mid;
    
    if(target > nums[mid]) return recursive(nums, mid + 1, high, target);
    else return recursive(nums, low, mid - 1, target);
  }



  public static void main(String[] args) throws Exception {
    int[] nums1 = {-1,0,3,5,9,12};
    System.out.println(searchV2(nums1, 9));
    System.out.println(searchV2(nums1, 2));

    int[] nums2 = {5};
    System.out.println(searchV2(nums2, 5));
    System.out.println(searchV2(nums2, -5));

    int[] nums3 = {2,5};
    System.out.println(searchV2(nums3, 5));
  }
}
