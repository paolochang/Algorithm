class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        l1, l2 = len(word1), len(word2)
        max = l1 if l1 > l2 else l2
        res = ""
        for i in range(max):
            if l1 > i:
                res += word1[i]
            if l2 > i:
                res += word2[i]

        return res


ins = Solution()

print("Expected: apbqcr", "Output:", ins.mergeAlternately("abc", "pqr"))
print("Expected: apbqrs", "Output:", ins.mergeAlternately("ab", "pqrs"))
print("Expected: apbqcd", "Output:", ins.mergeAlternately("abcd", "pq"))
