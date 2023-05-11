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
    public int findTilt(TreeNode root) {
        DFS(root);
        return this.ret;
    }
    
    private int DFS(TreeNode node) {
        if (node == null) return 0;
        
        int left = DFS(node.left);
        int right = DFS(node.right);
        ret += Math.abs(left - right);
        return left + right + node.val;
    }
}