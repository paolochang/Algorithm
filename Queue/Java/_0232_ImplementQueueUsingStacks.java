package Queue.Java;

import java.util.Stack;

public class _0232_ImplementQueueUsingStacks {

  public static class MyQueue {
    Stack<Integer> stack;

    public MyQueue() {
      stack = new Stack<>();
    }
    
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
    
    public int pop() {
      return stack.pop();
    }
    
    public int peek() {
      return stack.peek();
    }
    
    public boolean empty() {
      return stack.empty();
    }
  }

  public static void main(String[] args) throws Exception {
    // ["MyQueue", "push", "push", "peek", "pop", "empty"]
    // [[], [1], [2], [], [], []]
    MyQueue myQueue1 = new MyQueue();
    myQueue1.push(1);
    myQueue1.push(2);
    System.out.println(myQueue1.peek());
    System.out.println(myQueue1.pop());
    System.out.println(myQueue1.empty());
  }
}
