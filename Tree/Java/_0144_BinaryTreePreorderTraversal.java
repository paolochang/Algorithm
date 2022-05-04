package Tree.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

  /**
   * Recursion
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public List<Integer> preorderTraversalV1(TreeNode root) {
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

  /**
   * Iteration
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public List<Integer> preorderTraversalV2(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    stack.push(root);

    while (!stack.empty()) {
      TreeNode currNode = stack.pop();

      list.add(currNode.val);

      if (currNode.right != null)
        stack.push(currNode.right);
      if (currNode.left != null)
        stack.push(currNode.left);
    }

    return list;
  }
}
