class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        if len(magazine) < len(ransomNote):
            return False
        for char in ransomNote:
            if magazine.find(char) < 0:
                return False
            else:
                magazine = magazine.replace(char, '', 1)
        return True


ins = Solution()

print(ins.canConstruct("a", "b"))
print(ins.canConstruct("aa", "ab"))
print(ins.canConstruct("aa", "aab"))
