function isPalindrome(s: string): boolean {
  let str = s.toLowerCase().replace(/[_\W]+/g, "");
  return str === str.split("").reverse().join("");
}

console.log(isPalindrome("A man, a plan, a canal: Panama"));
console.log(isPalindrome("race a car"));
console.log(isPalindrome("a."));
console.log(isPalindrome("ab@a"));
