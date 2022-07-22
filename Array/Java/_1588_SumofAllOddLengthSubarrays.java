package Array.Java;

public class _1588_SumofAllOddLengthSubarrays {

  public static void main(String[] args) throws Exception {
    int[] arr1 = {1,4,2,5,3};
    System.out.println(sumOddLengthSubarrays(arr1));
  }

  /**
   * Iteration
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(1)
   */
  public static int sumOddLengthSubarrays(int[] A) {
    int res = 0, n = A.length;
    for (int i = 0; i < n; ++i) {
      res += ((i + 1) * (n - i) + 1) / 2 * A[i];
    }
    return res;
  }
}
