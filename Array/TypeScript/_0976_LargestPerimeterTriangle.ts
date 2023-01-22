/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(1)
 */
function largestPerimeter(nums: number[]): number {
  let desc = nums.sort((a, b) => b - a);
  for (let i = 0; i < desc.length - 2; i++) {
    if (desc[i] < desc[i + 1] + desc[i + 2]) {
      return desc[i] + desc[i + 1] + desc[i + 2];
    }
  }
  return 0;
}

console.log(largestPerimeter([2, 1, 2]));
console.log(largestPerimeter([1, 2, 1, 10]));
