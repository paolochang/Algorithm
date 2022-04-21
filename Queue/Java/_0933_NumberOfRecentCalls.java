package Queue.Java;

import java.util.Stack;

public class _0933_NumberOfRecentCalls {

  public static class RecentCounterV1 {

    Stack<Integer> stack;

    public RecentCounterV1() {
      stack = new Stack<>();
    }
    
    public int ping(int t) {
      stack.push(t);
      Object[] temp = stack.toArray();
      int[] range = new int[]{ t - 3000, t};
      int count = 0;
      for (int i = 0; i < temp.length; i++) {
        if (range[0] <= (int)temp[i] && (int)temp[i] <= range[1]) {
          count++;
        }
      }
      return count;
    }
}
  public static void main(String[] args) throws Exception {
    // ["RecentCounter", "ping", "ping", "ping", "ping"]
    // [[], [1], [100], [3001], [3002]]
    RecentCounterV1 recentCounter1 = new RecentCounterV1();
    recentCounter1.ping(1);     // requests = [1], range is [-2999,1], return 1
    recentCounter1.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
    recentCounter1.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
    recentCounter1.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
  }
}
