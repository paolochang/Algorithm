package Array.Java;

public class _0605_CanPlaceFlowers {
  /**
   * Iteration
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   * Test Cases:
   * [1,0,0,0,1]
   * 1
   * [1,0,0,0,1]
   * 2
   * [1,0,0,0,0,1]
   * 2
   * [0,0,1,0,1]
   * 1
   * [1,0,0,0,1,0,0]
   * 2
   * [0]
   * 1
   */
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
      int num = 0;
      for (int i = 0; i < flowerbed.length; i++) {
        if (flowerbed[i] == 0) {
          if (
              (flowerbed.length == 1) ||
              (i == 0 && flowerbed[i+1] == 0) ||
              ((i > 0 && flowerbed[i-1] == 0) && (i < flowerbed.length-2 && flowerbed[i+1] == 0)) || 
              (i == flowerbed.length-1 && flowerbed[i-1] == 0)
            ) {
            flowerbed[i] = 1;
            num++;
          }
        }
      }
      return num >= n;
  }
}
