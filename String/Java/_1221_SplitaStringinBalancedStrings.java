package String.Java;

import java.util.Stack;

public class _1221_SplitaStringinBalancedStrings {

  /**
   * Iteration using Stack
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public int balancedStringSplitV1(String s) {
    Stack<Character> stack = new Stack<>();
    int count = 0;
    for (char ch : s.toCharArray()) {
      if (stack.isEmpty() || stack.peek() == ch)
        stack.push(ch);
      else
        stack.pop();
      if (stack.isEmpty()) 
        count++;
    }
    return count;
  }

  /**
   * Iteration
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public int balancedStringSplitV2(String s) {
    int count = 0;
    int strLen = 0;
    for (char letter : s.toCharArray()) {
      strLen += (letter == 'R' ? 1 : -1);
      if (strLen == 0) {
        count++;
      }
    }
    return count;
  }
}
