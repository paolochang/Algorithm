package LinkedList.Java;

public class _0237_DeleteNodeinaLinkedList {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }

  /**
   * Time Complexity: BigO(1)
   * Space Complexity: BigO(1)
   */
  public void deleteNode(ListNode node) {
    if (node.next == null)
      return;
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
