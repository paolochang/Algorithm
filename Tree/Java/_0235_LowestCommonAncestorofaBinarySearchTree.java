package Tree.Java;

public class _0235_LowestCommonAncestorofaBinarySearchTree {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

  /**
   * Recursion
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    return search(root, p, q);
  }

  private TreeNode search(TreeNode node, TreeNode p, TreeNode q) {
    if (node.val > p.val && node.val > q.val) return search(node.left, p, q);
    else if (node.val < p.val && node.val < q.val) return search(node.right, p, q);
    return node;
  }
}
