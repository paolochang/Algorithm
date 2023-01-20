from typing import List


class Solution:
    # Iteration
    # Time Complexity: BigO(N^2)
    # Space Complexity: BigO(1)
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        highest = 0
        for customer in accounts:
            sum = 0
            for balance in customer:
                sum += balance
            if sum > highest:
                highest = sum
        return highest


ins = Solution

print(ins.maximumWealth(ins, [
    [1, 2, 3],
    [3, 2, 1],
]))
print(ins.maximumWealth(ins, [
    [1, 5],
    [7, 3],
    [3, 5],
]))
print(ins.maximumWealth(ins, [
    [2, 8, 7],
    [7, 1, 3],
    [1, 9, 5],
]))
