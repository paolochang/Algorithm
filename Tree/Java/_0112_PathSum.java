package Tree.Java;

import java.util.Stack;

public class _0112_PathSum {
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
   * Iteration
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) return false;
    Stack<TreeNode> stack = new Stack<>();
    Stack<Integer> sum = new Stack<>();
    stack.push(root);
    sum.push(root.val);
    while (!stack.isEmpty()) {
      TreeNode curr = stack.pop();
      int currValue = sum.pop();
      
      if (curr.left == null && curr.right == null) {
        if (currValue == targetSum)
          return true;
      }
      else {
        if (curr.left != null) {
          stack.push(curr.left);
          sum.push(curr.left.val + currValue);
        }
        if (curr.right != null) {
          stack.push(curr.right);
          sum.push(curr.right.val + currValue);
        }
      }
    }
    return false;
  }
}
