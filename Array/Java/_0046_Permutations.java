package Array.Java;

import java.util.ArrayList;
import java.util.List;

public class _0046_Permutations {

  public static void main(String[] args) throws Exception {
    int[] nums1 = {1,2,3};
    permute(nums1);
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> results = new ArrayList<>();
    backtrack(results, new ArrayList<>(), nums);
    return results;
 }
 
 private static void backtrack(List<List<Integer>> results, List<Integer> temp, int [] nums){
    if(temp.size() == nums.length) {
      results.add(new ArrayList<>(temp));
    } else{
       for(int num : nums){ 
          if(temp.contains(num)) continue; // element already exists, skip
          temp.add(num);
          backtrack(results, temp, nums);
          temp.remove(temp.size() - 1);
       }
    }
 } 
}
