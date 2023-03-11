class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(N)
    def toLowerCase(self, s: str) -> str:
        res = ""
        for c in s:
            # ord(): find unicode of 'c' (inverse of ord(): chr())
            if ord("A") <= ord(c) <= ord("Z"):
                res += chr((ord(c) - ord("A")) + ord("a"))
            else:
                res += c
        return res


ins = Solution()

print(ins.toLowerCase("Hello"))
print(ins.toLowerCase("here"))
print(ins.toLowerCase("LOVELY"))
