class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def hammingWeight(self, n: int) -> int:
        count = 0
        while n:
            n &= n - 1
            count += 1
        return count

    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def hammingWeightV2(self, n: int) -> int:
        count = 0
        while n:
            count += n & 1
            n >>= 1
        return count

    # Iteration
    # Time Complexity: BigO(1)
    # Space Complexity: BigO(1)
    def hammingWeightV3(self, n: int) -> int:
        return bin(n).count('1')

    # Iteration
    # Time Complexity: BigO(1)
    # Space Complexity: BigO(1)
    def hammingWeightV4(self, n: int) -> int:
        return n.bit_count()


ins = Solution()

print(ins.hammingWeightV2(11))
print(ins.hammingWeightV2(128))
print(ins.hammingWeightV2(4294967293))
