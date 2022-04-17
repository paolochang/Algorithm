package String.Java;

import java.util.Stack;

public class _0020_ValidParentheses {

  public static void main(String[] args) throws Exception {
    System.out.println("answer: (true) " + isValid("()"));
    System.out.println("answer: (true) " + isValid("()[]{}"));
    System.out.println("answer: (false) " + isValid("(]"));
    System.out.println("answer: (false) " + isValid("([)]"));
    System.out.println("answer: (true) " + isValid("{[]}"));
    System.out.println("answer: (false) " + isValid("]"));
    System.out.println("answer: (false) " + isValid("(])"));
  }

  /**
   * Stack
   * Analysis
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        stack.push(s.charAt(i));
      }
      else {
        if (stack.empty()) return false;
        char peek = stack.peek();
        if (
          (peek == '(' && s.charAt(i) == ')') || 
          (peek == '{' && s.charAt(i) == '}') || 
          (peek == '[' && s.charAt(i) == ']')) {
          stack.pop();
        }
        else return false;
      }
    }
    return stack.empty() ? true : false;
  }
}
