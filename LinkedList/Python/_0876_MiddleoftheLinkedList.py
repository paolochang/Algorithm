from typing import Optional


class ListNode:
    # Definition for singly-linked list.
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    @classmethod
    def fromvalues(Cls, values):
        head = None
        for value in reversed(values):
            head = Cls(value, head)
        return head

    def __iter__(self):
        yield self.val
        if self.next:
            yield from self.next

    def __str__(self):
        return "->".join(map(str, self))


class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        hare = head
        tortoise = head
        while hare and hare.next:
            hare = hare.next.next
            tortoise = tortoise.next

        return tortoise


program = Solution()
list1 = program.middleNode(ListNode.fromvalues([1, 2, 3, 4, 5]))
list2 = program.middleNode(ListNode.fromvalues([1, 2, 3, 4, 5, 6]))

print(list1)
print(list2)
