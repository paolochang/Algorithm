package String.Java;

public class _0028_ImplementstrStr {

  public static void main(String[] args) throws Exception {
    strStrV2("mississippi", "issip");
  }

  public int strStrV1(String haystack, String needle) {
    if (needle == "") return 0;
    return haystack.indexOf(needle); 
  }

  /**
   * Iteration
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(1)
   */
  public static int strStrV2(String haystack, String needle) {
    if (needle == "") return 0;

    char[] hsArr = haystack.toCharArray();
    char[] ndArr = needle.toCharArray();

    boolean flag = false;
    int at = -1;
    for (int i = 0, j = 0; i < hsArr.length; i++) {
      if (hsArr[i] == ndArr[j]) {
        if (j == 0) {
          at = i;
          flag = true;
        }
        if (j == ndArr.length - 1) return at;
        j++;
      }
      else {
        if (flag) {
          i = at;
          flag = false;
        }
        j = 0;
      }
    }
    return -1;
  }
}
