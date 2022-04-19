package Stack.Java;

import java.util.Stack;

public class _0155_MinStack {

  public static class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();

    public void push(int val) {
      if (min.empty() || getMin() >= val) {
        min.push(val);
      }
      stack.push(val);
    }
    
    public void pop() {
      if (stack.peek() == getMin()) {
        min.pop();
      }
      stack.pop();
    }
    
    public int top() {
      return stack.peek();
    }
    
    public int getMin() {
      return min.peek();
    }
  }

  public static void main(String[] args) throws Exception {
    // ["MinStack","push","push","push","getMin","pop","top","getMin"]
    // [[],[-2],[0],[-3],[],[],[],[]]
    System.out.println("TEST 1: minStack1");
    MinStack minStack1 = new MinStack();
    minStack1.push(-2);
    minStack1.push(0);
    minStack1.push(-3);
    System.out.println(minStack1.getMin()); // return -3
    minStack1.pop();
    System.out.println(minStack1.top());    // return 0
    System.out.println(minStack1.getMin()); // return -2

    // ["MinStack","push","push","push","getMin","pop","getMin"]
    // [[],[0],[1],[0],[],[],[]]
    System.out.println("TEST 2: minStack2");
    MinStack minStack2 = new MinStack();
    minStack2.push(0);
    minStack2.push(1);
    minStack2.push(0);
    System.out.println(minStack2.getMin()); // return 0
    minStack2.pop();
    System.out.println(minStack2.getMin()); // return 0

    // ["MinStack","push","push","push","push","getMin","pop","getMin","pop","getMin","pop","getMin"]
    // [[],[2],[0],[3],[0],[],[],[],[],[],[],[]]
    System.out.println("TEST 3: minStack3");
    MinStack minStack3 = new MinStack();
    minStack3.push(2);
    minStack3.push(0);
    minStack3.push(3);
    minStack3.push(0);
    System.out.println(minStack3.getMin());
    minStack3.pop();
    System.out.println(minStack3.getMin());
    minStack3.pop();
    System.out.println(minStack3.getMin());
    minStack3.pop();
    System.out.println(minStack3.getMin());

    // ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
    // [[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
    System.out.println("TEST 4: minStack4");
    MinStack minStack4 = new MinStack();
    minStack4.push(2147483646);
    minStack4.push(2147483646);
    minStack4.push(2147483647);
    System.out.println(minStack4.top());
    minStack4.pop();
    System.out.println(minStack4.getMin());
    minStack4.pop();
    System.out.println(minStack4.getMin());
    minStack4.pop();
    minStack4.push(2147483647);
    System.out.println(minStack4.top());
    System.out.println(minStack4.getMin());
    minStack4.push(-2147483648);
    System.out.println(minStack4.top());
    System.out.println(minStack4.getMin());
    minStack4.pop();
    System.out.println(minStack4.getMin());
  }
}
