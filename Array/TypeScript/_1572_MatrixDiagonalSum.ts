/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(1)
 */
function diagonalSum(mat: number[][]): number {
  let sum = 0;
  let rt = mat.length - 1;

  for (let row = 0; row < mat.length; row++) {
    sum += mat[row][row];
    if (row != rt) {
      sum += mat[row][rt];
    }
    rt--;
  }

  return sum;
}

console.log(
  diagonalSum([
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
  ])
);
console.log(
  diagonalSum([
    [1, 1, 1, 1],
    [1, 1, 1, 1],
    [1, 1, 1, 1],
    [1, 1, 1, 1],
  ])
);
console.log(diagonalSum([[5]]));
