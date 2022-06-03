package DynamicProgramming.Java;

public class _0070_ClimbingStairs {

  /**
   * Time Limit Exceeded
   * Time Complexity: BigO(2^n)
   */
  public int climbStairsV1(int n) {
    if (1 <= n && n <= 2) return n;
    return climbStairsV1(n-1) + climbStairsV1(n-2);
  }

  /**
   * Recursive Fibonacci Sequence
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  int[] steps;
  public int climbStairs(int n) {
      steps = new int[n + 1];
      return stairsHelp(n);
  }
  
  private int stairsHelp(int n) {
      if(n < 0)
          return 0;
      if(n == 0)
          return 1;
      if(steps[n] > 0)
          return steps[n];
      
      steps[n] = stairsHelp(n - 1) + stairsHelp(n - 2);
      return steps[n];
  }

  /**
   * Iterative Fibonacci Sequence
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(1)
   */
  public int climbStairsV3(int n) {
    if(n == 1)
      return 1;
    if(n == 2)
      return 2;
    
    int prev = 1;
    int cur = 2;
    for(int i = 3; i <= n; i++) {
      int next = cur + prev;
      prev = cur;
      cur = next;
    }
    return cur;
  }
}
