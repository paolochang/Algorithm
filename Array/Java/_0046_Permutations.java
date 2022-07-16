package Array.Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0046_Permutations {

  public static void main(String[] args) throws Exception {
    int[] nums1 = {1,2,3};
    permute(nums1);
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    backtrack(results, new HashSet<>(), nums);
    return results;
 }
 
 /**
  * Time Complexity: BigO(N)
  * Space Complexity: BigO(1) 
  * Using ArrayList tempList.contains(num) takes BigO(N)
  * Using HashSet   tempSet.contains(num)  takes BigO(1)
  */
 private static void backtrack(List<List<Integer>> results, Set<Integer> tempSet, int [] nums){
    if(tempSet.size() == nums.length) {
      results.add(new ArrayList<>(tempSet)); // shallow copy, deep copy
    } else{
       for(int num : nums){ 
          if(tempSet.contains(num)) continue; // element already exists, skip
          tempSet.add(num);
          backtrack(results, tempSet, nums);
          tempSet.remove(tempSet.size() - 1);
       }
    }
  }
}
