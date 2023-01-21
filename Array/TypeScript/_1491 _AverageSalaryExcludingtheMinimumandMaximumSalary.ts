function average(salary: number[]): number {
  const list = salary.sort((a, b) => a - b);
  return list.reduce((acc, cur, ind) => {
    if (ind !== 0 && ind !== list.length - 1) {
      return (acc += cur);
    } else if (ind === list.length - 1) {
      return acc / (list.length - 2);
    } else {
      return (acc = 0);
    }
  }, 0);
}

console.log(average([4000, 3000, 1000, 2000]));
console.log(average([1000, 2000, 3000]));
