from functools import reduce


class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        pod = reduce((lambda x, y: x * y), map(int, str(n)))
        sod = reduce((lambda x, y: x + y), map(int, str(n)))
        return pod - sod


ins = Solution()

print(ins.subtractProductAndSum(234))
print(ins.subtractProductAndSum(4421))
