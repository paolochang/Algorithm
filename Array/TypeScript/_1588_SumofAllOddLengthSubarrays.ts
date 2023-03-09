/**
 * Iteration
 * Time Complexity: BigO(N^3)
 * Space Complexity: BigO(N)
 */
function sumOddLengthSubarraysV1(arr: number[]): number {
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

/**
 * Iteration
 * Time Complexity: BigO(N^3)
 * Space Complexity: BigO(1)
 */
function sumOddLengthSubarraysV2(arr: number[]): number {
  let sum = 0;
  for (let odd = 1; odd <= arr.length; odd += 2) {
    for (let i = 0; i < arr.length; i++) {
      if (odd + i > arr.length) break;
      let index = i;
      let count = 0;
      while (count < odd) {
        sum += arr[index];
        index++;
        count++;
      }
    }
  }
  return sum;
}

console.log(
  "Expected: 58",
  "\tOutput:",
  sumOddLengthSubarraysV2([1, 4, 2, 5, 3])
);
console.log("Expected: 3", "\tOutput:", sumOddLengthSubarraysV2([1, 2]));
console.log("Expected: 66", "\tOutput:", sumOddLengthSubarraysV2([10, 11, 12]));
