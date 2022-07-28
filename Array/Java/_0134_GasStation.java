package Array.Java;

import java.util.HashSet;

public class _0134_GasStation {

  public static void main(String[] args) throws Exception {
    int[] gas1 = {1,2,3,4,5};
    int[] cst1 = {3,4,5,1,2};
    int[] gas2 = {2,3,4};
    int[] cst2 = {3,4,3};
    int[] gas3 = {5,1,2,3,4};
    int[] cst3 = {4,4,1,5,1};
    int[] gas4 = {3,1,1};
    int[] cst4 = {1,2,2};
    int[] gas5 = {6,1,4,3,5};
    int[] cst5 = {3,8,2,4,2};
    int[] gas6 = {3,3,4};
    int[] cst6 = {3,4,4};
    int[] gas7 = {4};
    int[] cst7 = {5};
    int[] gas8 = {6,0,1,3,2};
    int[] cst8 = {4,5,2,5,5};
    int[] gas9 = {5,0,9,4,3,3,9,9,1,2};
    int[] cst9 = {6,7,5,9,5,8,7,1,10,5};
    
    System.out.println(canCompleteCircuit(gas1, cst1)); // 3
    System.out.println(canCompleteCircuit(gas2, cst2)); // -1
    System.out.println(canCompleteCircuit(gas3, cst3)); // 4
    System.out.println(canCompleteCircuit(gas4, cst4)); // 0
    System.out.println(canCompleteCircuit(gas5, cst5)); // 2
    System.out.println(canCompleteCircuit(gas6, cst6)); // -1
    System.out.println(canCompleteCircuit(gas7, cst7)); // -1
    System.out.println(canCompleteCircuit(gas8, cst8)); // -1
    System.out.println(canCompleteCircuit(gas9, cst9)); // -1
  }

  public static int canCompleteCircuitV1(int[] gas, int[] cost) {
    if (gas.length > Integer.MAX_VALUE) return -1;
    HashSet<Integer> startSet = new HashSet<>();
    int start = -1, tank = 0, acc = 0, count = 0;
    boolean flag = false;
    for (int i = 0; i < gas.length; i++) {
        if (i == start) break;
        tank = gas[i] - cost[i];
        acc += tank;
        if (tank >= 0 && !flag && !startSet.contains(i)) {
          startSet.add(i);
          start = i;
          flag = true;
          count = 1;
        }
        else if (acc < 0) {
          if (count == gas.length) break;
          flag = false;
          acc = 0;
        }
        count++;
        if (i+1 == gas.length) i = -1;
    }
    return acc < 0 ? -1 : start;
  }

  /**
   * Iteration
   * Time Complexity: BigO(N)
   * Space Complexity: BigO(1)
   */
  public static int canCompleteCircuit(int[] gas, int[] cost) {
    int acc = 0, n = gas.length;
    int tank = 0, start = 0;
    for (int i = 0; i < n; i++) {
      tank += gas[i] - cost[i];
      acc += gas[i] - cost[i];
      if (tank < 0) {
        start = i+1;
        tank = 0;
      }
    }
    return acc >= 0 ? start : -1;
  }

}
