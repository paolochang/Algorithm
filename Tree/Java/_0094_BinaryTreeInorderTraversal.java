package Tree.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _0094_BinaryTreeInorderTraversal {

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
   * Recursion
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public List<Integer> inorderTraversalV1(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    inorder(root, list);
    return list;
  }

  /**
   * Depth First Traversal: Inorder
   * Left -> Node -> Right
   */
  public void inorder(TreeNode root, List<Integer> list) {
    if (root == null) return;
    inorder(root.left, list);
    list.add(root.val);
    inorder(root.right, list);
  }

  /**
   * Iteration
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public List<Integer> inorderTraversalV2(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode node = root;
    while(node != null || !stack.empty()) {
      while(node != null) {
        stack.push(node);
        node = node.left;
      }
      node = stack.pop();
      list.add(node.val);
      node = node.right;
    }
    return list;
  }
}
