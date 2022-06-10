package Tree.Java;

import java.util.Stack;

public class _0104_MaximumDepthofBinaryTree {
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
   * Iteration: Depth First Search
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public int maxDepthV1(TreeNode root) {
    if (root == null) return 0;
    
    int max = 0;
    Stack<TreeNode> stack = new Stack<>();
    Stack<Integer> depth = new Stack<>();
    stack.push(root);
    depth.push(1);
    
    while(!stack.empty()) {
      TreeNode node = stack.pop();
      int currDepth = depth.pop();
      max = Math.max(currDepth, max);
      if (node.left != null) {
        stack.push(node.left);
        depth.push(currDepth + 1);
      }
      if (node.right != null) {
        stack.push(node.right);
        depth.push(currDepth + 1);
      }
    }
    return max;
  }

  /**
   * Recursion
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public int maxDepthV2(TreeNode root) {
    // Base Condition
    if(root == null) return 0;
    // Hypothesis
    int left = maxDepthV2(root.left);
    int right = maxDepthV2(root.right);
    // Induction
    return Math.max(left, right) + 1;
}
}
