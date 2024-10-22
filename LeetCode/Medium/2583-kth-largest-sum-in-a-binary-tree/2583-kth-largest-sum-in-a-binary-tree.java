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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) return -1;

        PriorityQueue<Long> ret = new PriorityQueue<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            long tempRet = 0;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode v = q.poll();
                tempRet += v.val;

                if (v.left != null) q.add(v.left);
                if (v.right != null) q.add(v.right);
            }

            ret.add(tempRet);
            if (ret.size() > k) ret.poll();
        }

        return ret.size() < k ? -1 : ret.peek();
    }
}