from typing import List


class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def arraySign(self, nums: List[int]) -> int:
        prod = 1
        for i in range(len(nums)):
            if nums[i] < 0:
                prod *= -1
            elif nums[i] == 0:
                return 0
        return prod


ins = Solution()

print(ins.arraySign([-1, -2, -3, -4, 3, 2, 1]))
print(ins.arraySign([1, 5, 0, 2, -3]))
print(ins.arraySign([-1, 1, -1, 1, -1]))
