/**
 * Mathematics
 * Time Complexity: BigO(1)
 * Space Complexity: BigO(1)
 */
function countOdds(low: number, high: number): number {
  let includes = high % 2 == 1 || low % 2 == 1 ? 1 : 0;
  return Math.floor((high - low) / 2) + includes;
}
