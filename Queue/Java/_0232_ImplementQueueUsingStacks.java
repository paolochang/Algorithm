package Queue.Java;

import java.util.Stack;

public class _0232_ImplementQueueUsingStacks {

  public static class MyQueueV1 {
    Stack<Integer> stack;

    public MyQueueV1() {
      stack = new Stack<>();
    }
    
    /**
     * Analysis
     * Time Complexity: BigO(n)
     * Space Complexity: BigO(n)
     */
    public void push(int x) {
      Object[] temp = stack.toArray();
      while (!stack.empty()) {
        stack.pop();
      }
      stack.push(x);
      for (int i = 0; i < temp.length; i++) {
        stack.push((int)temp[i]);
      }
    }
    
    /** Time Complexity: BigO(1) */
    public int pop() {
      return stack.pop();
    }
    
    /** Time Complexity: BigO(1) */
    public int peek() {
      return stack.peek();
    }
    
    /** Time Complexity: BigO(1) */
    public boolean empty() {
      return stack.empty();
    }
  }

  // Reverse pop
  class MyQueueV2 {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;
    int first;
    
    public MyQueueV2() {
      stackIn = new Stack<>();
      stackOut = new Stack<>();
    }
    
    public void push(int x) {
      if(stackIn.isEmpty())
        first = x;
      stackIn.push(x);
    }
    
    /**
     * Amortized analysis
     * Analysis
     * Time Complexity: BigO(n)
     * Space Complexity: BigO(1)
     */
    public int pop() {
      if(stackOut.isEmpty()) {
        while(!stackIn.isEmpty())
          stackOut.push(stackIn.pop());
      }
      return stackOut.pop();
    }
    
    public int peek() {
      if(!stackOut.isEmpty())
        return stackOut.peek();
      return first;
    }
    
    public boolean empty() {
      return stackIn.isEmpty() && stackOut.isEmpty();
    }
  }


  public static void main(String[] args) throws Exception {
    // ["MyQueue", "push", "push", "peek", "pop", "empty"]
    // [[], [1], [2], [], [], []]
    MyQueueV1 myQueue1 = new MyQueueV1();
    myQueue1.push(1);
    myQueue1.push(2);
    System.out.println(myQueue1.peek());
    System.out.println(myQueue1.pop());
    System.out.println(myQueue1.empty());
  }
}
