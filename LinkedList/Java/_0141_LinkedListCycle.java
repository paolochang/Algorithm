package LinkedList.Java;

import java.util.HashSet;

public class _0141_LinkedListCycle {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public static void main(String[] args) throws Exception {
    // head = [3,2,0,-4], pos = 1
    ListNode ex1node1 = new ListNode(3);
    ListNode ex1node2 = new ListNode(2);
    ListNode ex1node3 = new ListNode(0);
    ListNode ex1node4 = new ListNode(-4);
    ex1node1.next = ex1node2;
    ex1node2.next = ex1node3;
    ex1node3.next = ex1node4;
    System.out.println(hasCycleV1(ex1node1));

    // head = [1,2], pos = 0
    ListNode ex2node1 = new ListNode(1);
    ListNode ex2node2 = new ListNode(2);
    ex2node1.next = ex2node2;
    System.out.println(hasCycleV1(ex2node1));

    // head = [1], pos = -1
    ListNode ex3node1 = new ListNode(1);
    System.out.println(hasCycleV1(ex3node1));
  }

  /**
   * Iterative Approach
   * Analysis
   * Time Complexity: BigO(n)
   * Space Complexity: BigO(n)
   */
  public static boolean hasCycleV1(ListNode head) {
    HashSet<ListNode> set = new HashSet<>();
    while (head != null) {
      if (!set.add(head)) return true;
      head = head.next;
    }
    return false;
  }

  /**
   * Floyd's tortoise and hare
   * Analysis
   * Time Complexity: 
   * Space Complexity:
   */
  public static boolean hasCycleV2(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) return true;
    }
    return false;
  }
}