class Solution:
    # Mathematics
    # Time Complexity: BigO(1)
    # Space Complexity: BigO(1)
    def countOdds(self, low: int, high: int) -> int:
        is_odd = 1 if high % 2 == 1 or low % 2 == 1 else 0
        return (high - low) // 2 + is_odd


ins = Solution()

print(ins.countOdds(3, 7))
print(ins.countOdds(8, 10))
