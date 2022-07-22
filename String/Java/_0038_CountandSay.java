package String.Java;

public class _0038_CountandSay {

  public static void main(String[] args) throws Exception {
    // System.out.println(countAndSay(1));
    // System.out.println(countAndSay(2));
    // System.out.println(countAndSay(3));
    System.out.println(countAndSay(4));
  }

  /**
   * Iteration: brute force
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(1)
   */
  public static String countAndSay(int n) {
    String say = "1";
    for (int i = 2; i <= n; i++) {
      String temp = "";
      for (int j = 0, count = 1; j < say.length(); j++) {
        if (j+1 < say.length() && say.charAt(j) == say.charAt(j+1) ) {
          count++;
        }
        else {
          temp += String.valueOf(count) + say.charAt(j);
          count = 1;
        }
      }
      say = temp;
    }
    return say;
  }
}
