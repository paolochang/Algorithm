function freqAlphabets(s: string): string {
  let res: string[] = [];
  for (let i = s.length - 1; i >= 0; i--) {
    if (s[i] == "#") {
      let chr = s[i - 2] + s[i - 1] + s[i];
      res.unshift(String.fromCharCode(96 + parseInt(chr, 10)));
      i -= 2;
    } else {
      res.unshift(String.fromCharCode(96 + parseInt(s[i], 10)));
    }
  }
  return res.join("");
}

console.log(freqAlphabets("10#11#12"));
console.log(freqAlphabets("1326#"));
