package Tree.Java;

import java.util.ArrayList;
import java.util.List;

public class _0101_SymmetricTree {

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

  private List<Integer> left = new ArrayList<>();
  private List<Integer> right = new ArrayList<>();

  /**
   * Depth First Traversal: preorder
   * Node -> Left -> Right
   */
  private void preorder(TreeNode root, List<Integer> list) {
    if (root == null) {
      list.add(null);
      return;
    }
    list.add(root.val);
    preorder(root.left, list);
    preorder(root.right, list);
  }

  private void mirroredPeorder(TreeNode root, List<Integer> list) {
    if (root == null) {
      list.add(null);
      return;
    }
    list.add(root.val);
    mirroredPeorder(root.right, list);
    mirroredPeorder(root.left, list);
  }

  public boolean isSymmetric(TreeNode root) {
    preorder(root.left, left);
    mirroredPeorder(root.right, right);
    return left.equals(right);
  }
}
