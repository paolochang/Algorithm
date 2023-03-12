class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(N)
    def freqAlphabets(self, s: str) -> str:
        res = []
        tmp = ""
        for x in reversed(s):
            if len(tmp) == 1 or x == "#":
                tmp = x + tmp
                continue

            tmp = x + tmp
            tmp = tmp.replace("#", "")
            res.insert(0, chr(96 + int(tmp)))
            tmp = ""

        return "".join(res)


ins = Solution()

print(ins.freqAlphabets("10#11#12"))
print(ins.freqAlphabets("1326#"))
