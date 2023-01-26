/**
 * Definition for node.
 */
export class Node {
  val: number;
  children: Node[];
  constructor(val?: number) {
    this.val = val === undefined ? 0 : val;
    this.children = [];
  }
}

function preorder(root: Node | null): number[] {
  let res: number[] = [];
  const helper = (root: Node | null) => {
    if (root === null) return null;
    res.push(root.val);
    for (const child of root.children) {
      helper(child);
    }
  };
  helper(root);
  return res;
}

let root1 = new Node(1);
let r1c1 = new Node(3);
let r1c2 = new Node(2);
let r1c3 = new Node(4);
let r1c1c1 = new Node(5);
let r1c1c2 = new Node(6);

root1.children = [r1c1, r1c2, r1c3];
r1c1.children = [r1c1c1, r1c1c2];

let root2 = new Node(1);
let r2c1 = new Node(2);
let r2c2 = new Node(3);
let r2c3 = new Node(4);
let r2c4 = new Node(5);
let r2c2c1 = new Node(6);
let r2c2c2 = new Node(7);
let r2c3c1 = new Node(8);
let r2c4c1 = new Node(9);
let r2c4c2 = new Node(10);
let r2c2c2c1 = new Node(11);
let r2c3c1c1 = new Node(12);
let r2c4c1c1 = new Node(13);
let r2c2c2c1c1 = new Node(14);

root2.children = [r2c1, r2c2, r2c3, r2c4];
r2c2.children = [r2c2c1, r2c2c2];
r2c3.children = [r2c3c1];
r2c4.children = [r2c4c1, r2c4c2];
r2c2c2.children = [r2c2c2c1];
r2c3c1.children = [r2c3c1c1];
r2c4c1.children = [r2c4c1c1];
r2c2c2c1.children = [r2c2c2c1c1];

console.log(preorder(root1));
console.log(preorder(root2));
