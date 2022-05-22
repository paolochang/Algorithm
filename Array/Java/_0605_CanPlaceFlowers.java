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
  public boolean canPlaceFlowersV1(int[] flowerbed, int n) {
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

  /**
   * Iteration
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(1)
   */
  public boolean canPlaceFlowersV2(int[] flowerbed, int n) {
    for (int i = 0; n > 0 && i < flowerbed.length; ++i) {
      if (flowerbed[i] == 1) {
        i++;
      }
      else {
        int left = i - 1 >= 0 ? flowerbed[i - 1] : 0;
        int right = i + 1 < flowerbed.length ? flowerbed[i + 1] : 0;
        if (left == 0 && right == 0) {
          n--;
          i++;
        }
      }
    }
    return n <= 0;
  }
}
