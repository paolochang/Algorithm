package Queue.Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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

  /**
   * Queue 
   * Analysis
   * Time Complexity: BigO(1)
   * Space Complexity: BigO(1)
   */
  class RecentCounterV2 {
    Queue<Integer> history;
    
    public RecentCounterV2() {
        this.history = new LinkedList<>();
    }
    
    public int ping(int t) {
        this.history.add(t);
        while(history.element() + 3000 < t)
            history.remove();
        
        return history.size();
    }
  }
  
  class RecentCounterV3 {
    List<Integer> history;
    int oldPing;
    
    public RecentCounterV3() {
        history = new ArrayList<>();
        oldPing = 0;
    }
    
    public int ping(int t) {
        history.add(t);
        
        if(oldPing < history.size() && history.get(oldPing) < t - 3000)
            oldPing = search(oldPing);
        
        return history.size() - oldPing;
    }
    
    /**
     * Binary Search
     * Analysis
     * Time Complexity: BigO(log n)
     * Space Complexity: BigO(1)
     */
    private int search(int low) {
        int high = history.size() - 1;
        int target = history.get(high) - 3000;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(history.get(mid) == target)
                return mid;
            else if(history.get(mid) > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
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
