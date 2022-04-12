package LinkedList.Java;

public class _0203_RemoveLinkedListElements {

  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public static void main(String[] args) throws Exception {
    ListNode ex1node1 = new ListNode(1);
    ListNode ex1node2 = new ListNode(2);
    ListNode ex1node3 = new ListNode(6);
    ListNode ex1node4 = new ListNode(3);
    ListNode ex1node5 = new ListNode(4);
    ListNode ex1node6 = new ListNode(5);
    ListNode ex1node7 = new ListNode(6);
    ex1node1.next = ex1node2;
    ex1node2.next = ex1node3;
    ex1node3.next = ex1node4;
    ex1node4.next = ex1node5;
    ex1node5.next = ex1node6;
    ex1node6.next = ex1node7;
    removeElementsV2(ex1node5, 6);

    ListNode ex2node1 = new ListNode();
    removeElementsV2(ex2node1, 1);

    ListNode ex3node1 = new ListNode(7);
    ListNode ex3node2 = new ListNode(7);
    ListNode ex3node3 = new ListNode(7);
    ListNode ex3node4 = new ListNode(7);
    ex3node1.next = ex3node2;
    ex3node2.next = ex3node3;
    ex3node3.next = ex3node4;
    removeElementsV2(ex3node1, 7);
  }

  /**
   * Iterative Approach
   * Analysis
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public static ListNode removeElementsV1(ListNode head, int val) {
    ListNode headNode = new ListNode();
    ListNode tailNode = headNode;
    while (head != null) {
      if (head.val != val) {
        tailNode.next = new ListNode(head.val);
        tailNode = tailNode.next;
      }
      head = head.next;
    }
    return headNode.next;
  }

  /**
   * Two Pointers
   * Analysis
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(1)
   */
  public static ListNode removeElementsV2(ListNode head, int val) {
    ListNode curr = head;
    ListNode prev = head;
    while (curr != null) {
      if (curr.val == val) {
        if (curr == head) {
          head = curr.next;
        }
        else {
          prev.next = curr.next;
        }
      }
      else {
        prev = curr;
      }
      curr = curr.next;
    }
    return head;
  }
}
