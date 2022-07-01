package String.Java;

public class _0014_LongestCommonPrefix {

  /**
   * Iteration
   * Time Complexity: BigO(NM^2)
   * Space Complexity: BigO(M)
   */
  public String longestCommonPrefix(String[] strs) {
    String prefix = strs[0];
    for(int i = 1;i < strs.length; i++){
        while(strs[i].indexOf(prefix) != 0)
            prefix = prefix.substring(0, prefix.length() - 1);
        if(prefix.isEmpty())
            break;
    }
    return prefix;
  }
}
