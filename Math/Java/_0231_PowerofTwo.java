package Math.Java;

public class _0231_PowerofTwo {

  public static boolean isPowerOfTwo(int n) {
    if (n == 0)
      return false;

    while (n != 1) {
      if (n % 2 != 0)
        return false;
      n = n / 2;
    }
    return true;
  }

  public static void main(String[] args) throws Exception {
    // Input: n = 1
    // Output: true
    // Explanation: 20 = 1
    System.out.println(isPowerOfTwo(1));

    // Input: n = 16
    // Output: true
    // Explanation: 24 = 16
    System.out.println(isPowerOfTwo(16));

    // Input: n = 3
    // Output: false
    System.out.println(isPowerOfTwo(3));
  }
}