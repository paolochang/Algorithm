/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(1)
 */
function checkStraightLine(coordinates: number[][]): boolean {
  let mxd = coordinates[1][0] - coordinates[0][0];
  let myd = coordinates[1][1] - coordinates[0][1];

  for (let i = 1; i < coordinates.length - 1; i++) {
    let nxd = coordinates[i + 1][0] - coordinates[i][0];
    let nyd = coordinates[i + 1][1] - coordinates[i][1];

    if (mxd > nxd && myd > nyd) {
      let ckX = mxd / nxd;
      let ckY = myd / nyd;
      if (ckX == ckY) {
        mxd = nxd;
        myd = nyd;
        continue;
      }
      return false;
    } else if ((mxd == 0 && nxd == 0) || (myd == 0 && nyd == 0)) {
      continue;
    } else {
      let ckX = nxd / mxd;
      let ckY = nyd / myd;
      if (ckX == ckY) {
        continue;
      }
      return false;
    }
  }
  return true;
}

console.log(
  "[[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]] | Expected:",
  true,
  "| Output:",
  checkStraightLine([
    [1, 2],
    [2, 3],
    [3, 4],
    [4, 5],
    [5, 6],
    [6, 7],
  ])
);
console.log(
  "[[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]] | Expected:",
  false,
  "| Output:",
  checkStraightLine([
    [1, 1],
    [2, 2],
    [3, 4],
    [4, 5],
    [5, 6],
    [7, 7],
  ])
);
console.log(
  "[[0, 0],[0, 1],[0, -1]] | Expected:",
  true,
  "| Output:",
  checkStraightLine([
    [0, 0],
    [0, 1],
    [0, -1],
  ])
);
console.log(
  `[[0,1],[1,3],[-4,-7],[5,11]] | Expected:`,
  true,
  "| Output:",
  checkStraightLine([
    [0, 1],
    [1, 3],
    [-4, -7],
    [5, 11],
  ])
);
console.log(
  "[[3, 0],[2, 1],[1, 2],[-1, 4]] | Expected:",
  true,
  "| Output:",
  checkStraightLine([
    [3, 0],
    [2, 1],
    [1, 2],
    [-1, 4],
  ])
);
