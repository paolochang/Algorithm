/**
 * Iteration
 * Time Complexity: BigO(N^2)
 * Space Complexity: BigO(N)
 */
function nextGreaterElement(nums1: number[], nums2: number[]): number[] {
  let res: number[] = [];
  for (let i = 0; i < nums1.length; i++) {
    let idx = nums2.findIndex((num) => num == nums1[i]);
    let gt = nums2.filter((num, index) => num > nums1[i] && index > idx);
    if (gt.length > 0) res.push(gt[0]);
    else res.push(-1);
  }
  return res;
}

/**
 * Iteration
 * Time Complexity: BigO(N^2)
 * Space Complexity: BigO(N)
 */
function nextGreaterElementV2(nums1: number[], nums2: number[]): number[] {
  let res: number[] = [];
  nums1.forEach((num1) => {
    let idx = nums2.indexOf(num1);
    for (let j = idx + 1; j < nums2.length; j++) {
      if (nums2[j] > num1) {
        res.push(nums2[j]);
        return;
      }
    }
    res.push(-1);
  });
  return res;
}

console.log(
  "Expected: [ -1, 3, -1 ]",
  nextGreaterElementV2([4, 1, 2], [1, 3, 4, 2])
);
console.log("Expected: [ 3, -1 ]", nextGreaterElementV2([2, 4], [1, 2, 3, 4]));
console.log(
  "Expected: [7,7,7,7,7]",
  nextGreaterElementV2([1, 3, 5, 2, 4], [6, 5, 4, 3, 2, 1, 7])
);
