function sumOddLengthSubarrays(arr: number[]): number {
  let res = 0;
  for (let odd = 1; odd < arr.length + 1; odd += 2) {
    if (odd % 2 == 1) {
      let list: number[] = [];
      for (let i = 0; i < arr.length; i++) {
        list.push(arr[i]);
        if (odd == list.length) {
          res += list.reduce((acc, cur) => (acc += cur), 0);
          list = [];
          if (odd > 1) i -= odd - 1;
        }
      }
    }
  }
  return res;
}

console.log(
  "Expected: 58",
  "\tOutput:",
  sumOddLengthSubarrays([1, 4, 2, 5, 3])
);
console.log("Expected: 3", "\tOutput:", sumOddLengthSubarrays([1, 2]));
console.log("Expected: 66", "\tOutput:", sumOddLengthSubarrays([10, 11, 12]));
