from typing import List


class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        arr.sort()
        diff = arr[1] - arr[0]
        for num in range(2, len(arr)):
            if (arr[num] - arr[num-1] != diff):
                return False
        return True


ins = Solution()

print(ins.canMakeArithmeticProgression([3, 5, 1]))
print(ins.canMakeArithmeticProgression([1, 2, 4]))
