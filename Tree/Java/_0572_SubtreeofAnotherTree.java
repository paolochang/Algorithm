package Tree.Java;

public class _0572_SubtreeofAnotherTree {

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
  
  /**
   * Resursive: Preorder Traversal
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(1)
   */
  public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null) return false;
    if (isSame(root, subRoot)) return true;
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  private static boolean isSame(TreeNode r, TreeNode sr) {
    if (r == null && sr == null) return true;
    if (r == null || sr == null) return false;

    if (r.val != sr.val) return false;

    return isSame(r.left, sr.left) && isSame(r.right, sr.right);
  }
}
