/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(1)
 */
function areAlmostEqual(s1: string, s2: string): boolean {
  let dif1 = [];
  let dif2 = [];

  for (let i = 0; i < s1.length; i++) {
    if (s1[i] != s2[i]) {
      dif1.push(s1[i]);
      dif2.push(s2[i]);
      if (dif1.length > 2) return false;
    }
  }

  if (dif1.length == 0 && dif2.length == 0) return true;
  else if (dif1.length == 1 && dif2.length == 1) return false;
  return dif1[0] == dif2[1] && dif1[1] == dif2[0];
}

console.log("expected: true", areAlmostEqual("bank", "kanb"));
console.log("expected: false", areAlmostEqual("attack", "defend"));
console.log("expected: true", areAlmostEqual("kelb", "kelb"));
console.log("expected: false", areAlmostEqual("abcd", "dcba"));
console.log(
  "expected: true",
  areAlmostEqual(
    "ysmpagrkzsmmzmsssutzgpxrmoylkgemgfcperptsxjcsgojwourhxlhqkxumonfgrczmjvbhwvhpnocz",
    "ysmpagrqzsmmzmsssutzgpxrmoylkgemgfcperptsxjcsgojwourhxlhkkxumonfgrczmjvbhwvhpnocz"
  )
);
