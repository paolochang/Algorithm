import ListNode from "./ListNode";

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function getDecimalValue(head: ListNode | null): number {
  let list: number[] = [];

  while (head != null) {
    list.push(head.val);
    head = head.next;
  }

  return parseInt(list.join(""), 2);
}
