package DynamicProgramming.Java;

public class _0746_MinCostClimbingStairs {

  public int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int oldBest = 0, newBest = 0; // init
    for (int i = 2; i <= n; i++) {
      int optCost = Math.min(oldBest + cost[i - 2], newBest + cost[i - 1]); // [i - 2] is before
      oldBest = newBest;
      newBest = optCost;
    }
    return newBest;
  }
}
