package Array.Java;

public class _0463_IslandPerimeter {

  /**
   * Iteration
   * Time Complexity: BigO(n^2)
   * Space Complexity: BigO(n^2)
   */
  public int islandPerimeter(int[][] grid) {
    int row = grid.length;
    int col = grid[0].length;
    int p = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (grid[i][j] == 1) {
            
          // initial perimeter = 4
          p += 4;
          
          // check left
          if(j > 0 && grid[i][j-1] == 1) p -= 1;
          
          // check above
          if(i > 0 && grid[i-1][j] == 1) p -= 1;
          
          // check right
          if(j < col - 1 && grid[i][j + 1] == 1) p -= 1;
          
          // check bottom
          if(i < row - 1 && grid[i+1][j] == 1) p -= 1;
        }
      }
    }
    return p;
  }
}
