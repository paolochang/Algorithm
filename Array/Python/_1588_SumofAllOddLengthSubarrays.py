from typing import List


class Solution:
    # Iteration using Brute Force
    # Time Complexity: BigO(N^3)
    # Space Complexity: BigO(1)
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        res = 0
        for odd in range(1, len(arr) + 1):
            if odd % 2 == 1:
                for i in range(0, len(arr)):
                    if odd == len(arr[i : i + odd]):
                        res += sum(arr[i : i + odd])
        return res


ins = Solution()

print("Expected: 58", "\tOutput:", ins.sumOddLengthSubarrays([1, 4, 2, 5, 3]))
print("Expected: 3", "\tOutput:", ins.sumOddLengthSubarrays([1, 2]))
print("Expected: 66", "\tOutput:", ins.sumOddLengthSubarrays([10, 11, 12]))
