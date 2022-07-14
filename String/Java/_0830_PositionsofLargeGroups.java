package String.Java;

import java.util.ArrayList;
import java.util.List;

public class _0830_PositionsofLargeGroups {

  public static void main(String[] args) throws Exception {
    String s1 = "aa";
    String s2 = "aaa";
    System.out.println(largeGroupPositions(s1));
    System.out.println(largeGroupPositions(s2));
  }

  /**
   * Iteration
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(N)
   */
  public static List<List<Integer>> largeGroupPositions(String s) {
    List<List<Integer>> list = new ArrayList<>();
    char[] str = s.toCharArray();
    char temp = ' ';
    int count = 0, start = 0, end = 0;
    for (int i = 0; i < str.length; i++) {
      if (temp == str[i]) {
        count++;
        end = i;
        if ((i+1 == str.length || str[i] != str[i+1]) && count >= 3) {
          List<Integer> group = new ArrayList<>();
          group.add(start);
          group.add(end);
          list.add(group);
        }
      }
      else {
        temp = str[i];
        start = i;
        count = 1;
      }
    }
    return list;
  }
}
