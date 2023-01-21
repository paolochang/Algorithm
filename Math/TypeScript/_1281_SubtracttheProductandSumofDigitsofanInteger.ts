function subtractProductAndSum(n: number): number {
  const nStr = n.toString();
  let pod = 1;
  let sod = 0;
  for (const ns of nStr) {
    pod *= Number(ns);
    sod += Number(ns);
  }
  return pod - sod;
}

console.log(subtractProductAndSum(234));
console.log(subtractProductAndSum(4421));
