function mergeAlternately(word1: string, word2: string): string {
  let maxLength = word1.length > word2.length ? word1.length : word2.length;
  let res = "";
  for (let i = 0; i < maxLength; i++) {
    if (word1[i]) res += word1[i];
    if (word2[i]) res += word2[i];
  }
  return res;
}

console.log("Expected: apbqcr", "Output:", mergeAlternately("abc", "pqr"));
console.log("Expected: apbqrs", "Output:", mergeAlternately("ab", "pqrs"));
console.log("Expected: apbqcd", "Output:", mergeAlternately("abcd", "pq"));
