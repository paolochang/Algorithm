/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(N)
 */
function runningSum(nums: number[]): number[] {
  let sum = 0;
  return nums.map((num) => (sum += num));
}

console.log(runningSum([1, 2, 3, 4]));
console.log(runningSum([1, 1, 1, 1, 1]));
console.log(runningSum([3, 1, 2, 10, 1]));
