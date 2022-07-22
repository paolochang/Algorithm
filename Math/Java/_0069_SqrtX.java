package Math.Java;


public class _0069_SqrtX {

  /**
   * Iteration: Math
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(1)
   */
  public static int mySqrt(int x) {
    long res = x;
    while (res*res > x)
      res = (res + x/res) / 2;
    return (int) res;
  }
}
