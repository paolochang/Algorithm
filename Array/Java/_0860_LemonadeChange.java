package Array.Java;

import java.util.Stack;

public class _0860_LemonadeChange {

  /**
   * Iteration with using Stack
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public boolean lemonadeChangeV1(int[] bills) {
    Stack<Integer> stack5 = new Stack<>();
    Stack<Integer> stack10 = new Stack<>();
    
    for (int i = 0; i < bills.length; i++) {
      
      if (bills[i] == 5) stack5.add(bills[i]);
      else {
        switch(bills[i]) {
          case 10:
            if (!stack5.isEmpty()) {
              stack10.push(bills[i]);
              stack5.pop();
            }
            else return false;
            break;
          case 20:
            if (!stack10.isEmpty() && !stack5.isEmpty()) {
              stack10.pop();
              stack5.pop();
            }
            else if (stack5.size() >= 3) {
              stack5.pop();
              stack5.pop();
              stack5.pop();
            }
            else return false;
            break;
        }
      }
    }
    return true;
  }

  /**
   * Iteration with using integer variables
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public boolean lemonadeChangeV2(int[] bills) {
    int b5 = 0;
    int b10 = 0;
    
    for (int bill : bills) {
      if (bill == 5) b5++;
      else if (bill == 20){
         if (b5 >= 1 && b10 >= 1) {
           b10--;
           b5--;
           continue;
         }
         else if (b5 >= 3 && b10 == 0) {
          b5 -= 3;
          continue;
         }
         return false;
      }
      else if (bill == 10) {
        if (b5 == 0) return false;
        b10++;
        b5--;
      }
    }
    return true;
  }
}
