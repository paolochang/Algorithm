package String.Java;

public class _0344_ReverseString {

  public static void main(String[] args) throws Exception {
    char[] s1 = {'h','e','l','l','o'};
    char[] s2 = {'H','a','n','n','a','h'};
    System.out.println(reverseString(s1));
    System.out.println(reverseString(s2));
  }

  public static char[] reverseString(char[] s) {
    char[] reversed = new char[s.length];
    for (int i = 0; i < s.length; i++) {
      reversed[i] = s[s.length-1-i];
    }
    return reversed;
  }

  public static void reverseStringV2(char[] s) {}
}
