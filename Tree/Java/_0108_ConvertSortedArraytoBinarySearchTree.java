package Tree.Java;

public class _0108_ConvertSortedArraytoBinarySearchTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
  
  public TreeNode sortedArrayToBST(int[] nums) {
    return helper(nums, 0, nums.length -1);
  }

  /**
   * Recursion
   */
  private TreeNode helper(int[] nums, int left, int right){
    if (left > right) return null;
    int mid = left + (right - left)/2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = helper(nums, left, mid-1);
    root.right = helper(nums, mid+1, right);
    return root;
  }
}
