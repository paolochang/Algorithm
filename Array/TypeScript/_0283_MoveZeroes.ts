/**
 * Do not return anything, modify nums in-place instead.
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(N)
 */
function moveZeroes(nums: number[]): void {
  let zeros = nums.filter((num) => num == 0).length;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] == 0 && zeros != 0) {
      let zero = nums.splice(i, 1)[0];
      nums.push(zero);
      zeros -= 1;
      i -= 1;
    }
  }
}
