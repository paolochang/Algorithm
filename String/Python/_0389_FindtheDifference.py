class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        ls = list(s)
        lt = list(t)

        ls.sort()
        lt.sort()

        for i in range(0, len(lt)):
            try:
                if ls[i] != lt[i]:
                    return lt[i]

            except IndexError:
                return lt[i]


ins = Solution()

print(ins.findTheDifference("abcd", "abcde"))
print(ins.findTheDifference("", "y"))
