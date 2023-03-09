from typing import List


class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def diagonalSum(self, mat: List[List[int]]) -> int:
        sum = 0
        rt = len(mat) - 1

        for row in range(0, len(mat)):
            sum += mat[row][row]
            if row != rt:
                sum += mat[row][rt]
            rt -= 1

        return sum


ins = Solution()

print(ins.diagonalSum([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
print(ins.diagonalSum([[1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1]]))
print(ins.diagonalSum([[5]]))
