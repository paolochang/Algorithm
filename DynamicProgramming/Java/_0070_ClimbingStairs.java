package DynamicProgramming.Java;

public class _0070_ClimbingStairs {

  public int climbStairs(int n) {
    if (0 <= n && n <= 2) return n;
    return climbStairs(n-1) + climbStairs(n-2);
  }
}
