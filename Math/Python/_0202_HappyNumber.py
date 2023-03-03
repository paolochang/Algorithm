class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(N)
    def isHappy(self, n: int) -> bool:
        def sumOfSquares(n: int) -> int:
            num = 0
            while n:
                num += (n % 10) ** 2
                n = n // 10
            return num

        lst = set()
        while True:
            if n == 1:
                return True
            elif n in lst:
                return False
            lst.add(n)
            n = sumOfSquares(n)


ins = Solution()

print(ins.isHappy(19))
print(ins.isHappy(2))
print(ins.isHappy(3))
print(ins.isHappy(7))
