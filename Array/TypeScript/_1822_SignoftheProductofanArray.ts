/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(1)
 */
function arraySign(nums: number[]): number {
  let prod = 1;
  for (let num of nums) {
    if (num == 0) return 0;
    prod *= signFunc(num);
  }
  return prod;
}

function signFunc(x: number): number {
  if (x > 0) return 1;
  else if (x < 0) return -1;
  return 0;
}

console.log(arraySign([-1, -2, -3, -4, 3, 2, 1]));
console.log(arraySign([1, 5, 0, 2, -3]));
console.log(arraySign([-1, 1, -1, 1, -1]));
