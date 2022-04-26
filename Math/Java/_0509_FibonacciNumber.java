package Math.Java;

public class _0509_FibonacciNumber {

  /**
   * Recursion
   * CONS: double-exponential time
   */
  public static int fibV1(int n) {
    if (n < 2) return n;
    return fibV1(n - 1) + fibV1(n - 2);
  }

  /**
   * Iteration
   * CONS: exponential time
   */
  public static int fibV2(int n) {
    if (n < 2) return n;
    int a = 0, b = 1, temp;
    for (int i = 1; i < n; i++) {
      temp = a;
      a = b;
      b += temp;
    }
    return b;
  }

  /**
   * Other options:
   * Recursive doubling
   * A^n recursive doubling
   */

  public static void main(String[] args) throws Exception {
    // Input: n = 2
    // Output: 1
    // Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
    System.out.println(fibV1(2));

    // Input: n = 3
    // Output: 2
    // Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
    System.out.println(fibV1(3));

    // Input: n = 4
    // Output: 3
    // Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
    System.out.println(fibV1(4));
  }
}
