/**
 * Iteration
 * Time Complexity: BigO(N^2)
 * Space Complexity: BigO(1)
 */
function maximumWealth(accounts: number[][]): number {
  let highest = 0;
  for (let customer of accounts) {
    let sum = customer.reduce((acc, cur) => (acc += cur), 0);
    if (sum > highest) {
      highest = sum;
    }
  }
  return highest;
}

console.log(
  maximumWealth([
    [1, 2, 3],
    [3, 2, 1],
  ])
);
console.log(
  maximumWealth([
    [1, 5],
    [7, 3],
    [3, 5],
  ])
);
console.log(
  maximumWealth([
    [2, 8, 7],
    [7, 1, 3],
    [1, 9, 5],
  ])
);
