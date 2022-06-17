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
   * Example:
   * 들어오는 node의 값은 다음 노드의 값, 다음노드를 다음다음 노드로 설정한다
   */
  public void deleteNode(ListNode node) {
    if (node.next == null)
      return;
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
