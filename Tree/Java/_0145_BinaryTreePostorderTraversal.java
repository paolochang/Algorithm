package Tree.Java;

import java.util.ArrayList;
import java.util.List;

public class _0145_BinaryTreePostorderTraversal {

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

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    postorder(root, list);
    return list;
  }

  /**
   * Depth First Traversal: postorder
   * Left -> Right -> Node
   */
  public void postorder(TreeNode root, List<Integer> list) {
    if (root == null) return;
    postorder(root.left, list);
    postorder(root.right, list);
    list.add(root.val);
  }
}
