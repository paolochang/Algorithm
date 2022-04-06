function isAnagram(s: string, t: string): boolean {
  if (s.length != t.length) return false;
  let str1 = s.split("");
  let str2 = t.split("");
  return str1.sort().join("") === str2.sort().join("");
}

console.log(isAnagram("anagram", "nagaram"));
console.log(isAnagram("rat", "car"));
console.log(isAnagram("ac", "bb"));
