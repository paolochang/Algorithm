## Algorithms - LEETCODE

### <a name="table-of-contents"></a>Table of Contents

- [Array](#array)
- [Bit Manipulation](#bit-manipulation)
- [Dynamic Programming](#dynamic-programming)
- [Linked List](#linked-list)
- [Math](#math)
- [Queue](#queue)
- [Stack](#stack)
- [String](#string)
- [Tree](#tree)

### Questions

#### <a name="array"></a>Array

| #    | Title                                                                                                                                                         | Solution                                                                                                                                                                        | Difficulty | Tags                                                               |
| ---- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- | ------------------------------------------------------------------ |
| 0001 | [Two Sum](https://leetcode.com/problems/two-sum/)                                                                                                             | [Java](./Array/Java/_0001_TwoSum.java)                                                                                                                                          | Easy       | `Array`, `Hash Table`                                              |
| 0026 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)                                                     | [Java](./Array/Java/_0026_RemoveDuplicatesfromSortedArray.java)                                                                                                                 | Easy       | `Array`, `Two Pointers`                                            |
| 0046 | [Permutations](https://leetcode.com/problems/permutations/)                                                                                                   | [Java](./Array/Java/_0046_Permutations.java)                                                                                                                                    | Medium     | `Array`, `Backtracking`                                            |
| 0053 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)                                                                                           | [Java](./Array/Java/_0053_MaximumSubarray.java)                                                                                                                                 | Easy       | `Array`, `Divide Conquer`, `Dynamic Programming`                   |
| 0055 | [Jump Game](https://leetcode.com/problems/jump-game/)                                                                                                         | [Java](./Array/Java/_0055_JumpGame.java)                                                                                                                                        | Medium     | `Array`, `Dynamic Programming`, `Greedy`                           |
| 0066 | [Plus One](https://leetcode.com/problems/plus-one/)                                                                                                           | [Java](./Array/Java/_0066_PlusOne.java)                                                                                                                                         | Easy       | `Array`, `Math`                                                    |
| 0088 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)                                                                                       | [Java](./Array/Java/_0088_MergeSortedArray.java)                                                                                                                                | Easy       | `Array`, `Two Pointers`, `Sorting`                                 |
| 0118 | [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)                                                                                          | [Java](./Array/Java/_0118_PascalsTriangle.java)                                                                                                                                 | Easy       | `Array`, `Dynamic Programming`                                     |
| 0134 | [Gas Station](https://leetcode.com/problems/gas-station/)                                                                                                     | [Java](./Array/Java/_0134_GasStation.java)                                                                                                                                      | Medium     | `Array`, `Greedy`                                                  |
| 0136 | [Single Number](https://leetcode.com/problems/single-number/)                                                                                                 | [Java](./Array/Java/_0136_SingleNumber.java)                                                                                                                                    | Easy       | `Array`, `Bit Manipulation`                                        |
| 0169 | [Majority Element](https://leetcode.com/problems/majority-element/)                                                                                           | [Java](./Array/Java/_0169_MajorityElement.java)                                                                                                                                 | Easy       | `Array`, `Hash Table`, `Divide and Conquer`, `Sorting`, `Counting` |
| 0189 | [Rotate Array](https://leetcode.com/problems/rotate-array/)                                                                                                   | [Java](./Array/Java/_0189_RotateArray.java)                                                                                                                                     | Medium     | `Array`, `Math`, `Two Pointer`                                     |
| 0217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)                                                                                       | [Java](./Array/Java/_0217_ContainsDuplicate.java)                                                                                                                               | Easy       | `Array`, `Hash Table`, `Soring`                                    |
| 0463 | [Island Perimeter](https://leetcode.com/problems/island-perimeter/)                                                                                           | [Java](./Array/Java/_0463_IslandPerimeter.java)                                                                                                                                 | Easy       | `Array`, `Depth-First Search`, `Breadth-First Search`, `Matrix`    |
| 0500 | [Keyboard Row](https://leetcode.com/problems/keyboard-row/)                                                                                                   | [Java](./Array/Java/_0500_KeyboardRow.java)                                                                                                                                     | Easy       | `Array`, `Hash Table`, `String`                                    |
| 0605 | [Can Place Flowers](https://leetcode.com/problems/can-place-flowers/)                                                                                         | [Java](./Array/Java/_0605_CanPlaceFlowers.java)                                                                                                                                 | Easy       | `Array`, `Greedy`                                                  |
| 0733 | [Flood Fill](https://leetcode.com/problems/flood-fill/)                                                                                                       | [Java](./Array/Java/_0733_FloodFill.java)                                                                                                                                       | Easy       | `Array`, `Depth-First Search`, `Breadth-First Search`, `Matrix`    |
| 0860 | [Lemonade Change](https://leetcode.com/problems/lemonade-change/)                                                                                             | [Java](./Array/Java/_0860_LemonadeChange.java)                                                                                                                                  | Easy       | `Array`, `Greedy`                                                  |
| 0997 | [Find the Town Judge](https://leetcode.com/problems/find-the-town-judge/)                                                                                     | [Java](./Array/Java/_0997_FindtheTownJudge.java)                                                                                                                                | Easy       | `Array`, `Hash Table`, `Graph`                                     |
| 1480 | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/description/)                                                                 | [Python3](./Array/Python/_1480_RunningSumof1dArray.py), [TypeScript](./Array/TypeScript/_1480_RunningSumof1dArray.ts)                                                           | Easy       | `Array`, `Prefix Sum`                                              |
| 1491 | [Average Salary Excluding the Minimum and Maximum Salary](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/) | [Python3](./Array/Python/_1491_AverageSalaryExcludingtheMinimumandMaximumSalary.py), [TypeScript](./Array/TypeScript/_1491_AverageSalaryExcludingtheMinimumandMaximumSalary.ts) | Easy       | `Array`, `Sorting`                                                 |
| 1588 | [Sum of All Odd Length Subarrays](https://leetcode.com/problems/sum-of-all-odd-length-subarrays/)                                                             | [Java](./Array/Java/_1588_SumofAllOddLengthSubarrays.java)                                                                                                                      | Easy       | `Array`, `Math`, `Prefix Sum`                                      |
| 1672 | [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/description/)                                                                 | [Python3](./Array/Python/_1672_RichestCustomerWealth.py), [TypeScript](./Array/TypeScript/_1672_RichestCustomerWealth.py)                                                       | Easy       | `Array`, `Matrix`                                                  |
| 2053 | [Kth Distinct String in an Array](https://leetcode.com/problems/kth-distinct-string-in-an-array/description/)                                                 | [Java](./Array/Java/_2053_KthDistinctStringInAnArray.java), [Python3](./Array/Python/_2053_KthDistinctStringInAnArray.py)                                                       | Easy       | `Array`, `Hash Table`, `String`, `Counting`                        |

[To Questions](#table-of-contents)

#### <a name="bit-manipulation"></a>Bit Manipulation

| #    | Title                                                                           | Solution                                                                                                                          | Difficulty | Tags                                     |
| ---- | ------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ---------- | ---------------------------------------- |
| 0191 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/description/) | [Python3](./BitManipulatation/Python/_0191_Numberof1Bits.py), [TypeScript](./BitManipulatation/TypeScript/_0191_Numberof1Bits.ts) | Easy       | `Divide and Conquer`, `Bit Manipulation` |

[To Questions](#table-of-contents)

#### <a name="dynamic-programming"></a>Dynamic Programming

| #    | Title                                                                               | Solution                                                           | Difficulty | Tags                                             |
| ---- | ----------------------------------------------------------------------------------- | ------------------------------------------------------------------ | ---------- | ------------------------------------------------ |
| 0053 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)                 | [Java](./DynamicProgramming/Java/_0053_MaximumSubarray.java)       | Easy       | `Array`, `Divide Conquer`, `Dynamic Programming` |
| 0062 | [Unique Paths](https://leetcode.com/problems/unique-paths/)                         | [Java](./DynamicProgramming/Java/_0062_UniquePaths.java)           | Medium     | `Math`, `Dynamic Programming`, `Combinatorics`   |
| 0070 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)                   | [Java](./DynamicProgramming/Java/_0053_MaximumSubarray.java)       | Easy       | `Array`, `Divide Conquer`, `Dynamic Programming` |
| 0746 | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) | [Java](./DynamicProgramming/Java/_0746_MinCostClimbingStairs.java) | Easy       | `Array`, `Dynamic Programming`                   |

[To Questions](#table-of-contents)

#### <a name="linked-list"></a>Linked List

| #    | Title                                                                                             | Solution                                                                                                                            | Difficulty | Tags                                        |
| ---- | ------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ---------- | ------------------------------------------- |
| 0021 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)                   | [Java](./LinkedList/Java/_0021_MergeTwoSortedLists.java)                                                                            | Easy       | `Linked List`, `Recursion`                  |
| 0141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)                             | [Java](./LinkedList/Java/_0141_LinkedListCycle.java)                                                                                | Easy       | `Linked List`, `Hash Table`, `Two Pointers` |
| 0203 | [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)         | [Java](./LinkedList/Java/_0203_RemoveLinkedListElements.java)                                                                       | Easy       | `Linked List`, `Recursion`                  |
| 0237 | [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)       | [Java](./LinkedList/Java/_0237_DeleteNodeinaLinkedList.java)                                                                        | Easy       | `Linked List`                               |
| 0876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/description/) | [Python3](./LinkedList/Python/_0876_MiddleoftheLinkedList.py), [TypeScript](./LinkedList/TypeScript/_0876_MiddleoftheLinkedList.ts) | Easy       | `Linked List`, `Two Pointers`               |

[To Questions](#table-of-contents)

#### <a name="math"></a>Math

| #    | Title                                                                                                                                                  | Solution                                                                                                                                                            | Difficulty | Tags                                                      |
| ---- | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- | --------------------------------------------------------- |
| 0050 | [Pow(x, n)](https://leetcode.com/problems/powx-n/)                                                                                                     | [Java](./Math/Java/_0050_PowXN.java)                                                                                                                                | Medium     | `Math`, `Recursion`                                       |
| 0069 | [Sqrt(x)](https://leetcode.com/problems/sqrtx/)                                                                                                        | [Java](./Math/Java/_0069_SqrtX.java)                                                                                                                                | Easy       | `Math`, `Binary Search`                                   |
| 0171 | [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/)                                                                  | [Java](./Math/Java/_0171_ExcelSheetColumnNumber.java)                                                                                                               | Easy       | `Math`, `String`                                          |
| 0202 | [Happy Number](https://leetcode.com/problems/happy-number/)                                                                                            | [Java](./Math/Java/_0202_HappyNumber.java)                                                                                                                          | Easy       | `Hash Table`, `Math`, `Two Pointer`                       |
| 0231 | [Power of Two](https://leetcode.com/problems/power-of-two/)                                                                                            | [Java](./Math/Java/_0231_PowerofTwo.java)                                                                                                                           | Easy       | `Math`, `Bit Manipulation`, `Recursion`                   |
| 0412 | [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/)                                                                                                  | [Java](./Math/Java/_0412_FizzBuzz.java)                                                                                                                             | Easy       | `Math`, `String`                                          |
| 0509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)                                                                                    | [Java](./Math/Java/_0509_FibonacciNumber.java)                                                                                                                      | Easy       | `Math`, `Dynamic Programming`, `Recursion`, `Memoization` |
| 1281 | [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description) | [Python3](./Math/Python/_1281_SubtracttheProductandSumofDigitsofanInteger.py), [TypeScript](./Math/TypeScript/_1281_SubtracttheProductandSumofDigitsofanInteger.ts) | Easy       | `Math`                                                    |

[To Questions](#table-of-contents)

#### <a name="queue"></a>Queue

| #    | Title                                                                                       | Solution                                                  | Difficulty | Tags                             |
| ---- | ------------------------------------------------------------------------------------------- | --------------------------------------------------------- | ---------- | -------------------------------- |
| 0232 | [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | [Java](./Queue/Java/_0232_ImplementQueueUsingStacks.java) | Easy       | `Stack`, `Design`, `Queue`       |
| 0933 | [Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/)             | [Java](./Queue/Java/_0933_NumberOfRecentCalls.java)       | Easy       | `Design`, `Queue`, `Data Stream` |

[To Questions](#table-of-contents)

#### <a name="stack"></a>Stack

| #    | Title                                                 | Solution                                 | Difficulty | Tags              |
| ---- | ----------------------------------------------------- | ---------------------------------------- | ---------- | ----------------- |
| 0155 | [Min Stack](https://leetcode.com/problems/min-stack/) | [Java](./Stack/Java/_0155_MinStack.java) | Easy       | `Stack`, `Design` |

[To Questions](#table-of-contents)

#### <a name="string"></a>String

| #    | Title                                                                                                         | Solution                                                                                              | Difficulty | Tags                                        |
| ---- | ------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ---------- | ------------------------------------------- |
| 0013 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/)                                           | [Java](./String/Java/_0013_RomantoInteger.java)                                                       | Easy       | `Hash Table`, `Math`, `String`              |
| 0014 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)                                 | [Java](./String/Java/_0014_LongestCommonPrefix.java)                                                  | Easy       | `String`                                    |
| 0020 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)                                         | [Java](./String/Java/_0020_ValidParentheses.java)                                                     | Easy       | `String`, `Stack`                           |
| 0028 | [Implement strStr()](https://leetcode.com/problems/implement-strstr/)                                         | [Java](./String/Java/_0028_ImplementstrStr.java)                                                      | Easy       | `Two Pointers`, `String`, `String Matching` |
| 0038 | [Count and Say](https://leetcode.com/problems/count-and-say/)                                                 | [Java](./String/Java/_0038_CountandSay.java)                                                          | Medium     | `String`                                    |
| 0125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)                                           | [Java](./String/Java/_0125_ValidPalindrome.java)                                                      | Easy       | `String`, `Two Pointers`                    |
| 0179 | [Largest Number](https://leetcode.com/problems/largest-number/)                                               | [Java](./String/Java/_0179_LargestNumber.java)                                                        | Medium     | `String`, `Greedy`, `Sorting`               |
| 0242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/)                                                 | [Java](./String/Java/_0242_ValidAnagram.java)                                                         | Easy       | `String`, `Hash Table`, `Sorting`           |
| 0344 | [Reverse String](https://leetcode.com/problems/reverse-string/)                                               | [Java](./String/Java/_0344_ReverseString.java)                                                        | Easy       | `String`, `Two Pointers`, `Recursion`       |
| 0383 | [Ransom Note](https://leetcode.com/problems/ransom-note/description/)                                         | [Python3](./String/Python/_0383_RansomNote.py), [TypeScript](./String/TypeScript/_0383_RansomNote.ts) | Easy       | `Hash Table`, `String`, `Counting`          |
| 0551 | [Student Attendance Record I](https://leetcode.com/problems/student-attendance-record-i/)                     | [Java](./String/Java/_0551_StudentAttendanceRecordI.java)                                             | Easy       | `String`                                    |
| 0830 | [Positions of Large Groups](https://leetcode.com/problems/positions-of-large-groups/)                         | [Java](./String/Java/_0830_PositionsofLargeGroups.java)                                               | Easy       | `String`                                    |
| 1154 | [Day of the Year](https://leetcode.com/problems/day-of-the-year/)                                             | [Java](./String/Java/_1154_DayoftheYear.java)                                                         | Easy       | `Math`, `String`                            |
| 1221 | [Split a String in Balanced Strings](https://leetcode.com/problems/split-a-string-in-balanced-strings/)       | [Java](./String/Java/_1221_SplitaStringinBalancedStrings.java)                                        | Easy       | `String`, `Greedy`, `Counting`              |
| 2264 | [Largest 3-Same-Digit Number in String](https://leetcode.com/problems/largest-3-same-digit-number-in-string/) | [Java](./String/Java/_2264_Largest3SameDigitNumberinString.java)                                      | Easy       | `String`                                    |

[To Questions](#table-of-contents)

#### <a name="tree"></a>Tree

| #    | Title                                                                                                                           | Solution                                                               | Difficulty | Tags                                                                            |
| ---- | ------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------- | ------------------------------------------------------------------------------- |
| 0094 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)                                   | [Java](./Tree/Java/_0094_BinaryTreeInorderTraversal.java)              | Easy       | `Stack`, `Tree`, `Depth-First Search`, `Binary Tree`                            |
| 0101 | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)                                                                 | [Java](./Tree/Java/_0101_SymmetricTree.java)                           | Easy       | `Tree`, `Depth-First Search`, `Breadth-First Search`, `Binary Tree`             |
| 0104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)                                     | [Java](./Tree/Java/_0104_MaximumDepthofBinaryTree.java)                | Easy       | `Tree`, `Depth-Frist Search`, `Breadth-First Search`, `Binary Tree`             |
| 0108 | [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)         | [Java](./Tree/Java/_0108_ConvertSortedArraytoBinarySearchTree.java)    | Easy       | `Array`, `Divide and Conquer`, `Tree`, `Binary Search Tree`, `Binary Tree`      |
| 0112 | [Path Sum](https://leetcode.com/problems/path-sum/)                                                                             | [Java](./Tree/Java/_0112_PathSum.java)                                 | Easy       | `Tree`, `Depth-First Search`, `Breadth-First Search`, `Binary Tree`             |
| 0144 | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)                                 | [Java](./Tree/Java/_0144_BinaryTreePreorderTraversal.java)             | Easy       | `Stack`, `Tree`, `Depth-First Search`, `Binary Tree`                            |
| 0145 | [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)                               | [Java](./Tree/Java/_0145_BinaryTreePostorderTraversal.java)            | Easy       | `Stack`, `Tree`, `Depth-First Search`, `Binary Tree`                            |
| 0235 | [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | [Java](./Tree/Java/_0235_LowestCommonAncestorofaBinarySearchTree.java) | Easy       | `Tree`, `Depth-First Search`, `Binary Search Tree`, `Binary Tree`               |
| 0572 | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/)                                               | [Java](./Tree/Java/_0572_SubtreeofAnotherTree.java)                    | Easy       | `Tree`, `Depth-First Search`, `String Matching`, `Binary Tree`, `Hash Function` |
| 0700 | [Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/)                                 | [Java](./Tree/Java/_0700_SearchinaBinarySearchTree.java)               | Easy       | `Tree`, `Binary Search Tree`, `Binary Tree`                                     |
| 0704 | [Binary Search](https://leetcode.com/problems/binary-search/)                                                                   | [Java](./Tree/Java/_0704_BinarySearch.java)                            | Easy       | `Array`, `Binary Search`                                                        |

[To Questions](#table-of-contents)

### Troubleshoot

#### Error: `Debug: Imporing projects` on VSCode

On command palette, run `Java: Clean Java Language workspace`
