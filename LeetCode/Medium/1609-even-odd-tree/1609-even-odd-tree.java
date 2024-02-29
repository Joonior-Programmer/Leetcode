/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null || root.val % 2 == 0) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isOdd = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int prev = isOdd ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if ((isOdd && (curr.val % 2 == 0 || curr.val <= prev)) ||
                    (!isOdd && (curr.val % 2 != 0 || curr.val >= prev))) {
                    return false;
                }

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }

                prev = curr.val;
            }

            isOdd = !isOdd;
        }

        return true;
    }
}