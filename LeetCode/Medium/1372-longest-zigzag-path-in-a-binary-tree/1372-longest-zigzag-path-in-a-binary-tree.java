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
        DFS(root, 0, 0);
        return this.ret;
    }
    
    private void DFS(TreeNode node, int left, int right){
        if (node == null) return;
        
        ret = Math.max(ret, Math.max(left, right));
        DFS(node.left, right + 1, 0);
        DFS(node.right, 0, left + 1);
    }
}