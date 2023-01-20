/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(N)
 */
function canConstruct(ransomNote: string, magazine: string): boolean {
  let store = magazine.split("");
  for (let letter of ransomNote) {
    if (store.includes(letter)) {
      let index = store.indexOf(letter);
      store.splice(index, 1);
    } else return false;
  }
  return true;
}

console.log(canConstruct("a", "b"));
console.log(canConstruct("aa", "ab"));
console.log(canConstruct("aa", "aab"));
