/**
 Do not return anything, modify s in-place instead.
 */
function reverseString(s: string[]): void {
  for (let i = 0; i < s.length / 2; i++) {
    [s[i], s[s.length - 1 - i]] = [s[s.length - 1 - i], s[i]];
  }
}

let s1 = ["h", "e", "l", "l", "o"];
let s2 = ["H", "a", "n", "n", "a", "h"];

reverseString(s1);
reverseString(s2);
