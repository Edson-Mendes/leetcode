/**
 * Dado o root de uma binary tree, retorne a inorder traversal dos valores do nodes.
 *
 * Restrições:
 *
 * - O número de nodes na árvore está no intervalo [0, 100]
 *
 * - -100 <= Node.val <= 100
 *
 * Follow-up: A solução recursiva é trivial. Você poderia fazê-la iterativamente?
 */
const inorderTraversal = function (root) {
  const output = [];
  traverse(root, output);

  return output;
};

const traverse = (node, output) => {
  if (node === null) return;
  traverse(node.left, output);
  output.push(node.val);
  traverse(node.right, output);
};

function TreeNode(val, left, right) {
  this.val = val === undefined ? 0 : val;
  this.left = left === undefined ? null : left;
  this.right = right === undefined ? null : right;
}
