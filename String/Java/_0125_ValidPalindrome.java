package String.Java;

public class _0125_ValidPalindrome {

  public static void main(String[] args) throws Exception {
    System.out.println(isPalindromeV2("A man, a plan, a canal: Panama"));
    System.out.println(isPalindromeV2("race a car"));
    System.out.println(isPalindromeV2(" "));
    System.out.println(isPalindromeV2("0P"));
  }

  // O(n): Brute force
  public static boolean isPalindromeV1(String s) {
    String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    String reversed = "";
    for (int i = str.length() - 1; i >= 0 ; i--) {
      reversed += str.charAt(i);
    }
    if (reversed.equals(str)) 
      return true;
    return false;
  }

  // O(n) Two Pointers Technique
  public static boolean isPalindromeV2(String s) {
    String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == str.charAt(str.length()-1-i)) {
        if (i == str.length() - 1 - i) return true;
        continue;
      }
      else return false;
    }
    return true;
  }
}
