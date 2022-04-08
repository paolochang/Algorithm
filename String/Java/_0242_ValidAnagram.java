package String.Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _0242_ValidAnagram {

  public static void main(String[] args) throws Exception {
    System.out.println(isAnagramV2("anagram", "nagaram"));
    System.out.println(isAnagramV2("rat", "car"));
  }
  
  /**
   * Soring
   * Analysis
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public static boolean isAnagramV1(String s, String t) {
    char sStr[] = s.toCharArray(); // O(n)
    char tStr[] = t.toCharArray(); // O(n)
    Arrays.sort(sStr); // O(nlog(n))
    Arrays.sort(tStr); // O(nlog(n))
    if (Arrays.equals(sStr, tStr)) return true; // O(n)
    return false;
  }

  /**
   * Hash Table
   * Analysis
   * Time Complexity: BigO(n) 
   * Space Complexity: BigO(n)
   */
  public static boolean isAnagramV2(String s, String t) {

    if (s.length() != t.length()) return false;

    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      if (map.containsKey(sChar)) map.replace(sChar, map.get(sChar) + 1);
      else map.put(sChar, 1);
    }

    for (int j = 0; j < t.length(); j++) {
      char tChar = t.charAt(j);
      if (map.containsKey(tChar)) {
        int count = map.get(tChar) - 1;
        if (count == 0) map.remove(tChar);
        else map.replace(tChar, count);
      }
    }

    if (!map.isEmpty()) return false;
    return true;
  }
}

