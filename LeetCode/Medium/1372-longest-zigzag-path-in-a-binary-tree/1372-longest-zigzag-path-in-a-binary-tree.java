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
    int ret = 0;
     public int longestZigZag(TreeNode root) {
        DFS(root, true, 0);
        DFS(root, false, 0);
        return this.ret - 1;
    }
    
    private void DFS(TreeNode node, boolean is_left, int ret){
        if (node == null) {
            this.ret = Math.max(ret, this.ret);
            return;
        }
        DFS(node.left, !is_left, is_left ? ret + 1 : 0);
        DFS(node.right, !is_left, is_left ? 0 : ret + 1);
    }
}