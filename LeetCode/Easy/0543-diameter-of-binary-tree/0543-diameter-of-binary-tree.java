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
    
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ret;
    }
    
    private int dfs(TreeNode node){
        if (node == null) return 0;
        
        int l = dfs(node.left);
        int r = dfs(node.right);
        
        ret = Math.max(ret, l + r);
        return Math.max(l, r) + 1;
    }
}