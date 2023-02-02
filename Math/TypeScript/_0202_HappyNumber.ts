function isHappyV1(n: number): boolean {
  let num = n;
  while (num > 6) {
    let nl = num.toString().split("");
    num = nl.reduce((acc, val) => {
      return (acc += +val * +val);
    }, 0);
  }
  return num == 1 ? true : false;
}

function sumOfSquares(n: number): number {
  let num = 0;
  while (n !== 0) {
    const dig = n % 10;
    num += dig * dig;
    n = Math.floor(n / 10);
  }
  return num;
}

function isHappyV2(n: number): boolean {
  let fast = n,
    slow = n;

  do {
    fast = sumOfSquares(sumOfSquares(fast));
    slow = sumOfSquares(slow);
  } while (fast !== slow);

  return slow === 1;
}

console.log(isHappyV2(19));
console.log(isHappyV2(2));
console.log(isHappyV2(3));
console.log(isHappyV2(7));
