package String.Java;

public class _0344_ReverseString {

  public static void main(String[] args) throws Exception {
    char[] s1 = {'h','e','l','l','o'};
    char[] s2 = {'H','a','n','n','a','h'};
    reverseString(s1);
    reverseString(s2);
  }

  public static void reverseString(char[] s) {
    int j = s.length - 1;
    for (int i = 0; i < s.length/2; i++) {
      char temp = s[i];
      s[i] = s[j];
      s[j] = temp;
      j--;
    }
  }
}
