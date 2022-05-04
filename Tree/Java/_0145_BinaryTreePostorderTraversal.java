package Tree.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

  /**
   * Recursion
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public List<Integer> postorderTraversalV1(TreeNode root) {
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

  /**
   * Iteration
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public List<Integer> postorderTraversalV2(TreeNode root) {
    List<Integer> list = new ArrayList<>();

    if (root == null) return list;

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    Stack<Integer> out = new Stack<>();
        
    while(!stack.isEmpty()) {
      TreeNode currNode = stack.pop();
      out.push(currNode.val);
      
      if(currNode.left != null)
        stack.push(currNode.left);
      if(currNode.right != null)
        stack.push(currNode.right);
    }
    while(!out.isEmpty())
        list.add(out.pop());

    return list;
  }
}
