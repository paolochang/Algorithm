package Math.Java;

public class _0231_PowerofTwo {

  /**
   * Iteration
   * Time Complexity: BigO(log n)
   * Space Complexity: BigO(1)
   */
  public static boolean isPowerOfTwoV1(int n) {
    if (n == 0)
      return false;

    while (n != 1) {
      if (n % 2 != 0)
        return false;
      n = n / 2;
    }
    return true;
  }

  /**
   * Bitwise & (AND) Operation
   * Time Complexity: BigO(1)
   * Space Complexity: BigO(1)
   */
  public static boolean isPowerOfTwoV2(int n) {
    if (n < 1) 
      return false;
    return (n & (n - 1)) == 0;
  }

  /**
   * Recursion
   */
  public static boolean isPowerOfTwoV3(int n) {
    if(n == 0)
        return false;
    else if(n == 1)
        return true;
    else if(n % 2 == 1)
        return false;
    return isPowerOfTwoV3(n/2);
  }

  public static void main(String[] args) throws Exception {
    // Input: n = 1
    // Output: true
    // Explanation: 20 = 1
    System.out.println(isPowerOfTwoV3(1));

    // Input: n = 16
    // Output: true
    // Explanation: 24 = 16
    System.out.println(isPowerOfTwoV3(16));

    // Input: n = 3
    // Output: false
    System.out.println(isPowerOfTwoV3(3));
  }
}