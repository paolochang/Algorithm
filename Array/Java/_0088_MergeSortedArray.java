package Array.Java;

public class _0088_MergeSortedArray {

  public static void main(String[] args) throws Exception {
    int[] nums1v1 = {1,2,3,0,0,0};
    int[] nums2v1 = {2,5,6};
    int[] nums1v2 = {1};
    int[] nums2v2 = {};
    int[] nums1v3 = {0};
    int[] nums2v3 = {1};
    int[] nums1v4 = {2,0};
    int[] nums2v4 = {1};
    int[] nums1v5 = {-1,0,0,3,3,3,0,0,0};
    int[] nums2v5 = {1,2,2};
    int[] nums1v6 = {0,0,3,0,0,0,0,0,0};
    int[] nums2v6 = {-1,1,1,1,2,3};
    merge(nums1v1, 3, nums2v1, 3);
    merge(nums1v2, 1, nums2v2, 0);
    merge(nums1v3, 0, nums2v3, 1);
    merge(nums1v4, 1, nums2v4, 1);
    merge(nums1v5, 6, nums2v5, 3);
    merge(nums1v6, 3, nums2v6, 6);
  }

  /**
   * Iteration Backward
   * Time Complexity: BigO(N+M)
   * Space Complexity: BigO(1)
   */
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = nums1.length;
    while (i >= 0 && n > 0) {
      if (m > 0 && nums1[m - 1] > nums2[n - 1]) 
        nums1[--i] = nums1[--m];
      else 
        nums1[--i] = nums2[--n];
    }
  }
}
