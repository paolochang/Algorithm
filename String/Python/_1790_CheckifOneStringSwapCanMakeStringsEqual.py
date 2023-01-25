class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(1)
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        dif1 = []
        dif2 = []

        for i in range(0, len(s1)):
            if s1[i] != s2[i]:
                dif1.append(s1[i])
                dif2.append(s2[i])
                if len(dif1) > 2:
                    return False

        if len(dif1) == 0 and len(dif2) == 0:
            return True
        elif len(dif1) == 1 and len(dif2) == 1:
            return False
        return dif1[0] == dif2[1] and dif2[0] == dif1[1]


ins = Solution()

print("expected: True", ins.areAlmostEqual("bank", "kanb"))
print("expected: False", ins.areAlmostEqual("attack", "defend"))
print("expected: True", ins.areAlmostEqual("kelb", "kelb"))
print("expected: False", ins.areAlmostEqual("aa", "ac"))
print("expected: False", ins.areAlmostEqual("yhy", "hyc"))
