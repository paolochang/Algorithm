/**
 * Iteration
 * Time Complexity: BigO(N)
 * Space Complexity: BigO(N)
 */
function toLowerCase(s: string): string {
  const str = s.split("");
  for (let i = 0; i < str.length; i++) {
    if (str[i].charCodeAt(0) > 64 && str[i].charCodeAt(0) < 91)
      str[i] = String.fromCharCode(str[i].charCodeAt(0) + 32);
  }
  return str.join("");
}

console.log(toLowerCase("Hello"));
console.log(toLowerCase("here"));
console.log(toLowerCase("LOVELY"));
