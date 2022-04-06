package String.Java;

import java.util.Arrays;

public class _0242_ValidAnagram {

  public static void main(String[] args) throws Exception {
    System.out.println(isAnagramV2("anagram", "nagaram"));
    System.out.println(isAnagramV2("rat", "car"));
  }
  
  public static boolean isAnagramV2(String s, String t) {
    char sStr[] = s.toCharArray();
    char tStr[] = t.toCharArray();
    Arrays.sort(sStr);
    Arrays.sort(tStr);
    if (Arrays.equals(sStr, tStr)) return true;
    return false;
  }
}

