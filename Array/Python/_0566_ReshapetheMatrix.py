from typing import List


class Solution:
    # Iteration
    # Time Complexity: BigO(N^2)
    # Space Complexity: BigO(N^2)
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        if len(mat) * len(mat[0]) != r * c:
            return mat

        res = []
        rowlist = []

        for row in range(0, len(mat)):
            for col in range(0, len(mat[row])):
                rowlist.append(mat[row][col])

                if len(rowlist) == c:
                    res.append(rowlist)
                    rowlist = []

        return res


ins = Solution()

print(
    ins.matrixReshape(
        [
            [1, 2],
            [3, 4],
        ],
        1,
        4,
    )
)
print(
    ins.matrixReshape(
        [
            [1, 2],
            [3, 4],
        ],
        2,
        4,
    )
)
print(
    ins.matrixReshape(
        [
            [1, 2],
            [3, 4],
        ],
        4,
        1,
    )
)
