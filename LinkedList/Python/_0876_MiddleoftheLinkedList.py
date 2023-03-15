from typing import Optional
from listnode import ListNode


class Solution:
    # Iteration
    # Time Complexity: BigO(N)
    # Space Complexity: BigO(N)
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        hare = head
        tortoise = head
        while hare and hare.next:
            hare = hare.next.next
            tortoise = tortoise.next

        return tortoise


ins = Solution()

print(ins.middleNode(ListNode.fromvalues([1, 2, 3, 4, 5])))
print(ins.middleNode(ListNode.fromvalues([1, 2, 3, 4, 5, 6])))
