package LinkedList.Java;

public class _0021_MergeTwoSortedLists {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public static void main(String[] args) throws Exception {

    ListNode list1a_1 = new ListNode(1);
    ListNode list1a_2 = new ListNode(2);
    ListNode list1a_3 = new ListNode(4);
    list1a_1.next = list1a_2;
    list1a_2.next = list1a_3;

    ListNode list1b_1 = new ListNode(1);
    ListNode list1b_2 = new ListNode(3);
    ListNode list1b_3 = new ListNode(4);
    list1b_1.next = list1b_2;
    list1b_2.next = list1b_3;
    
    ListNode list2a = new ListNode();
    ListNode list2b = new ListNode();
    ListNode list3a = new ListNode();
    ListNode list3b = new ListNode(0);
    
    mergeTwoLists(list1a_1, list1b_1);
    mergeTwoLists(list2a, list2b);
    mergeTwoLists(list3a, list3b);
  }

  /**
   * Linked List
   * Analysis
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(1)
   */
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode head = new ListNode();
    ListNode tail = head;
    while (list1 != null && list2 != null) {
        if (list2.val <= list1.val) {
            tail.next = list2;
            list2 = list2.next;
        }
        else {
            tail.next = list1;
            list1 = list1.next;
        }
        tail = tail.next;
    }
    tail.next = (list1 != null) ? list1 : list2;
    return head.next;
  }
}