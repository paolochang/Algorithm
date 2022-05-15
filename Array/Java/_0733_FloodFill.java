package Array.Java;

public class _0733_FloodFill {

  /**
   * DFS
   */
  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int oldColor = image[sr][sc];
    
    if (oldColor != newColor) dfsfill(image, sr, sc, newColor, oldColor);

    return image;
  }

  private void dfsfill(int[][] image, int sr, int sc, int newColor, int oldColor) {
    if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[sr].length || image[sr][sc] != oldColor) {
      return;
    }

    image[sr][sc] = newColor;

    dfsfill(image, sr - 1, sc, newColor, oldColor);
    dfsfill(image, sr + 1, sc, newColor, oldColor);
    dfsfill(image, sr, sc - 1, newColor, oldColor);
    dfsfill(image, sr, sc + 1, newColor, oldColor);
  }
}
