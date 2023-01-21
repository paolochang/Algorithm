/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(1)
 *
 * Instead of using reduce(), filter() can be used
 */
function hammingWeight(n: number): number {
  return n
    .toString(2)
    .split("")
    .reduce((acc, cur) => {
      if (cur === "1") return (acc += 1);
      else return (acc += 0);
    }, 0);
}

console.log(hammingWeight(11));
console.log(hammingWeight(128));
console.log(hammingWeight(4294967293));
