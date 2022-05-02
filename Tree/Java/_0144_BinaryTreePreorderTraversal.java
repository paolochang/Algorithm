package Tree.Java;

import java.util.ArrayList;
import java.util.List;

public class _0144_BinaryTreePreorderTraversal {


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

  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    preorder(root, list);
    return list;
  }

  /**
   * Depth First Traversal: preorder
   * Node -> Left -> Right
   */
  public void preorder(TreeNode root, List<Integer> list) {
    if (root == null) return;
    list.add(root.val);
    preorder(root.left, list);
    preorder(root.right, list);
  }
}
