package Array.Java;

import java.util.ArrayList;
import java.util.List;

public class _0118_PascalsTriangle {

  public static void main(String[] args) throws Exception {
    System.out.println(generate(1));
    System.out.println(generate(2));
    System.out.println(generate(3));
    System.out.println(generate(4));
    System.out.println(generate(5));
  }

  /**
   * Iteration: brute force
   * Time Complexity: BigO(N^2)
   * Space Complexity: BigO(NM)
   */
  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<>();
    res.add(new ArrayList<Integer>(){{add(1);}});

    if (numRows == 1) return res;

    for (int i = 1; i < numRows; i++) {
      List<Integer> temp = new ArrayList<Integer>();
      for (int j = 0; j < i+1; j++) { // i+1 == res.get(i-1).size()
        if (j == 0 || j == i) {
          temp.add(1);
        }
        else {
          int left = res.get(i-1).get(j-1);
          int right = res.get(i-1).get(j);
          temp.add(left + right);
        }
      }
      res.add(temp);
    }

    return res;
  }
}
