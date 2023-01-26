from typing import List


class Solution:
    # Iteration
    # Time Complexity: BigO(N^2)
    # Space Complexity: BigO(N)
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack = []
        dict = {}
        res = []

        for i in nums2:
            print('i', i)
            while len(stack) > 0 and i > stack[-1]:
                print('stack:', stack)
                print('add', i, 'to dict')
                dict[stack.pop()] = i
                print('dict:', dict)
            print('add', i, 'to stack')
            stack.append(i)

        for i in nums1:
            res.append(dict.get(i, -1))

        return res


ins = Solution()

print("Expected: [ -1, 3, -1 ]", "Output:",
      ins.nextGreaterElement([4, 1, 2], [1, 3, 4, 2]))
print("Expected: [ 3, -1 ]", "\tOutput:",
      ins.nextGreaterElement([2, 4], [1, 2, 3, 4]))
print("Expected: [7,7,7,7,7]", "\tOutput:",
      ins.nextGreaterElement([1, 3, 5, 2, 4], [6, 5, 4, 3, 2, 1, 7]))
