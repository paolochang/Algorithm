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

    # Iteration with the contribution of arr[i]
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def sumOddLengthSubarraysV2(self, arr):
        res, n = 0, len(arr)
        for i, a in enumerate(arr):
            res += ((i + 1) * (n - i) + 1) // 2 * a
        return res


ins = Solution()

print("Expected: 58", "\tOutput:", ins.sumOddLengthSubarraysV2([1, 4, 2, 5, 3]))
print("Expected: 3", "\tOutput:", ins.sumOddLengthSubarraysV2([1, 2]))
print("Expected: 66", "\tOutput:", ins.sumOddLengthSubarraysV2([10, 11, 12]))
