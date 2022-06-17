package String.Java;

import java.util.ArrayList;
import java.util.Comparator;

public class _2264_Largest3SameDigitNumberinString {

  /**
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public String largestGoodInteger(String num) {
    ArrayList<String> nums = new ArrayList<>();
    StringBuilder str = new StringBuilder();
    char[] numArr = num.toCharArray();
    char test = ' ';
    for (char numChar : numArr) {
        if (test == numChar) {
            str.append(numChar);
            if (str.length() == 3) {
                nums.add(str.toString());
            }
        }
        else {
            test = numChar;
            str.setLength(0);
            str.append(numChar);
        }
    }
    if (nums.size() == 0) return "";
    nums.sort(Comparator.reverseOrder());
    return nums.get(0);
}
}
