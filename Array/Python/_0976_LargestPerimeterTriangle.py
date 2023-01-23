from typing import List


class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort(reverse=True)
        for i in range(len(nums) - 2):
            if nums[i] < nums[i+1] + nums[i+2]:
                return nums[i] + nums[i+1] + nums[i+2]
        return 0


ins = Solution()

print(ins.largestPerimeter([2, 1, 2]))
print(ins.largestPerimeter([1, 2, 1, 10]))
