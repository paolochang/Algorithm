package DynamicProgramming.Java;

public class _0062_UniquePaths {

  /**
   * Time Complexity: BigO(mn)
   * Space Complexity: BigO(n)
   */
  public int uniquePaths(int m, int n) {
    int[] path = new int[n];
    for (int i = 0; i < n; i++) {
      path[i] = 1;
    }
    int temp;
    for (int row = 1; row < m; row++) {
      for (int col = 1; col < n; col++) {
        temp = path[col];
        path[col] = path[col-1] + temp;
      }
    }
    return path[n-1];
  }
}
