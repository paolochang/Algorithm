/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(1)
 */
function nearestValidPoint(x: number, y: number, points: number[][]): number {
  let smallest: number | undefined = undefined;
  let index: number = -1;
  let count = 0;
  for (let i = 0; i < points.length; i++) {
    let manhattan = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
    if (points[i][0] == x && points[i][1] == y) {
      return i;
    } else if (
      (points[i][0] == x || points[i][1] == y) &&
      (smallest == undefined || smallest >= manhattan)
    ) {
      if (smallest === manhattan) {
        count++;
      } else {
        count = 1;
        index = i;
      }
      smallest = manhattan;
    }
  }

  return count >= 1 ? index : -1;
}

console.log(
  "expected: 2 /",
  nearestValidPoint(3, 4, [
    [1, 2],
    [3, 1],
    [2, 4],
    [2, 3],
    [4, 4],
  ])
);
console.log("expected: 0 /", nearestValidPoint(3, 4, [[3, 4]]));
console.log("expected: -1 /", nearestValidPoint(3, 4, [[2, 3]]));
console.log(
  "expected: 0 /",
  nearestValidPoint(1, 1, [
    [1, 2],
    [3, 3],
    [3, 3],
  ])
);
console.log(
  "expected: 3 /",
  nearestValidPoint(5, 1, [
    [1, 1],
    [6, 2],
    [1, 5],
    [3, 1],
  ])
);
console.log(
  "expected: 3 /",
  nearestValidPoint(1, 1, [
    [1, 2],
    [2, 1],
    [1, 2],
    [1, 1],
    [1, 1],
    [1, 1],
    [1, 2],
    [2, 1],
    [2, 1],
    [2, 1],
    [2, 1],
    [2, 2],
    [2, 2],
    [2, 1],
    [2, 2],
    [2, 2],
    [2, 1],
    [2, 2],
    [2, 1],
    [2, 1],
    [1, 1],
    [2, 1],
    [1, 2],
    [1, 1],
    [1, 1],
    [2, 2],
    [2, 2],
    [2, 2],
    [1, 1],
    [2, 1],
    [2, 1],
    [2, 1],
    [2, 2],
    [1, 2],
    [1, 2],
    [1, 1],
    [1, 2],
    [1, 2],
  ])
);
