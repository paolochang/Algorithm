/**
 * Definition for singly-linked list.
 */
class ListNode {
  val: number;
  next: ListNode | null;
  constructor(val?: number, next?: ListNode | null) {
    this.val = val === undefined ? 0 : val;
    this.next = next === undefined ? null : next;
  }
}

function middleNode(head: ListNode | null): ListNode | null {
  let hare = head;
  let tortoise = head;
  while (hare && tortoise && hare.next) {
    hare = hare.next?.next;
    tortoise = tortoise.next;
  }
  return tortoise;
}

let l1 = new ListNode(1);
let nd2 = new ListNode(2);
let nd3 = new ListNode(3);
let nd4 = new ListNode(4);
let nd5 = new ListNode(5);
let nd6 = new ListNode(6);

l1.next = nd2;
nd2.next = nd3;
nd3.next = nd4;
nd4.next = nd5;

console.log(middleNode(l1));

nd5.next = nd6;

console.log(middleNode(l1));
