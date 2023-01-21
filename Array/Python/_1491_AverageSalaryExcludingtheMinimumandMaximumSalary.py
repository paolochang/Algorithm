from typing import List


class Solution:
    def average(self, salary: List[int]) -> float:
        salary.remove(max(salary))
        salary.remove(min(salary))
        return sum(salary) / len(salary)


ins = Solution()

print(ins.average([4000, 3000, 1000, 2000]))
print(ins.average([1000, 2000, 3000]))
