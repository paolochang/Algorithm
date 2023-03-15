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

let l1 = new ListNode(1);
let nd2 = new ListNode(0);
let nd3 = new ListNode(1);

l1.next = nd2;
nd2.next = nd3;

console.log(getDecimalValue(l1));

let l2 = new ListNode(0);

console.log(getDecimalValue(l2));
