function findTheDifference(s: string, t: string): string {
  let res = "";
  let ls: string[] = s.split("").sort();
  let lt: string[] = t.split("").sort();

  for (let i = 0; i < lt.length; i++) {
    if (ls[i] != lt[i]) {
      res = lt[i];
      break;
    }
  }

  return res;
}

console.log(findTheDifference("abcd", "abcde"));
console.log(findTheDifference("", "y"));
