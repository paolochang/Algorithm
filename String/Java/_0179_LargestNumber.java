package String.Java;

import java.util.Arrays;

public class _0179_LargestNumber {

  /**
   * Time Complexity: BigO(nlogn)
   * Space Complexity: BigO(n)
   */ 
  public String largestNumber(int[] nums) {
    String[] numStr = new String[nums.length];
    for(int i = 0; i < nums.length; i++) {
        numStr[i] = String.valueOf(nums[i]);
    }
    Arrays.sort(numStr, (a, b) -> {
        long n1 = Long.valueOf(a + b);
        long n2 = Long.valueOf(b + a);
        return n1 < n2 ? 1 : -1;
    });
    
    StringBuilder sb = new StringBuilder();
    for(String str: numStr) {
        sb.append(str);
    }
    
    return sb.toString().charAt(0) == '0' ? "0" : sb.toString();
  }
}
