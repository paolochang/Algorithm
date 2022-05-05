package Tree.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _0700_SearchinaBinarySearchTree {
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
   * Iteration: Preorder
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public TreeNode searchBST(TreeNode root, int val) {
    List<Integer> preorder = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    
    stack.push(root);
    while (!stack.empty()) {
      TreeNode currNode = stack.pop();
      if (currNode.val == val) {
          return currNode;
      }
      preorder.add(currNode.val);
      if (currNode.right != null) stack.push(currNode.right);
      if (currNode.left != null) stack.push(currNode.left);
    }
    return null;
  }

}
