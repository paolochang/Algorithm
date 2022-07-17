package Math.Java;

public class _0171_ExcelSheetColumnNumber {

  public static void main(String[] args) throws Exception {
    System.out.println("1: " + titleToNumber("A"));
    System.out.println("26: " + titleToNumber("Z"));
    System.out.println("27: " + titleToNumber("AA")); // 27
    System.out.println("28: " + titleToNumber("AB")); // 28
    System.out.println("701: " + titleToNumber("ZY")); // 701
    System.out.println("2147483647: " + titleToNumber("FXSHRXW")); // 2147483647
  }

  /**
   * Iteration
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(1)
   */
  public static int titleToNumber(String columnTitle) {
    int ans = 0;
    for (int i = columnTitle.length() - 1, j = 0; i >= 0; i--, j++) {
        ans += ((int) columnTitle.charAt(i) - 64) * Math.pow(26, j);
    }
    return ans;
  }
}
