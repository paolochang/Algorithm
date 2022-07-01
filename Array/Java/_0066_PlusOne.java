package Array.Java;

public class _0066_PlusOne {

  /**
   * Iteration
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(N)
   */
  public int[] plusOne(int[] digits) {
    for (int i = digits.length-1; i >= 0 ; i--) {
      if (digits[i] != 9) {
        digits[i] += 1;
        return digits;
      }
      else
        digits[i] = 0;
    }
    int[] newDigits = new int[digits.length+1];
    newDigits[0] = 1;
    return newDigits;
  }
}
