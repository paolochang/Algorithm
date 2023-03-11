function matrixReshape(mat: number[][], r: number, c: number): number[][] {
  if (r * c != mat.length * mat[0].length) return mat;

  let res: number[][] = [];
  let rowList: number[] = [];
  let row = 0;
  let col = 0;

  while (
    res.reduce((acc, cur) => (acc += cur.length), 0) <
    mat.length * mat[0].length
  ) {
    if (typeof mat?.[row]?.[col] === "undefined") {
      row += 1;
      col = 0;
    }
    rowList.push(mat?.[row]?.[col]);

    if (rowList.length == c) {
      res.push(rowList);
      rowList = [];
    }

    col += 1;
  }
  return res;
}

console.log(
  matrixReshape(
    [
      [1, 2],
      [3, 4],
    ],
    1,
    4
  )
);
console.log(
  matrixReshape(
    [
      [1, 2],
      [3, 4],
    ],
    2,
    4
  )
);
console.log(
  matrixReshape(
    [
      [1, 2],
      [3, 4],
    ],
    4,
    1
  )
);
