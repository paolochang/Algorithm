from listnode import ListNode


class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        binary = []

        while head != None:
            binary.append(head.val)
            head = head.next

        return int("".join(str(bit) for bit in binary), 2)


ins = Solution()

print(ins.getDecimalValue(ListNode.fromvalues([1, 0, 1])))
print(ins.getDecimalValue(ListNode.fromvalues([0])))
