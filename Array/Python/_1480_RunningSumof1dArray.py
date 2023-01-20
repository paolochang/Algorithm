from typing import List


class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(N)
    def runningSum(self, nums: List[int]) -> List[int]:
        result = []
        sum = 0
        for num in nums:
            sum += num
            result.append(sum)
        return result


ins = Solution

print(ins.runningSum(ins, [1, 2, 3, 4]))
print(ins.runningSum(ins, [1, 1, 1, 1, 1]))
print(ins.runningSum(ins, [3, 1, 2, 10, 1]))
