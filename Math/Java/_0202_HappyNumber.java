package Math.Java;

public class _0202_HappyNumber {

  /**
   * Two Pointer with Floyd's cycle-finding (a.k.a. Tortoise and the Hare algorithm)
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(1)
   */
  public boolean isHappy(int n) {
    int slow = n, fast = n;
    do {
      slow = squareSum(slow);
      fast = squareSum(squareSum(fast));

      if (slow == 1) return true;
    } while (slow != fast);
    return false;
  }

  /**
   * 1^2 + 1^2 = 2
   * 2^2 = 4 ------> notice that from here we are starting with 4
   * 4^2 = 16
   * 1^2 + 6^2 = 37
   * 3^2 + 7^2 = 58
   * 5^2 + 8^2 = 89
   * 8^2 + 9^2 = 145
   * 1^2 + 4^2 + 5^2 = 42
   * 4^2 + 2^2 = 20
   * 2^2 + 0^2 = 4 -------> notice that we just get back to 4 again
   */
  private int squareSum(int num) {
    int sum = 0, newNum = num;
    while (newNum != 0) {
      sum += Math.pow(newNum%10, 2);
      newNum /= 10;
    }
    return sum;
  }
}
