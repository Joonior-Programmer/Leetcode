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
    
    public int distributeCoins(TreeNode root) {
        dfs(root);
        
        return ret;
    }
    
    private int dfs(TreeNode node){
        if (node == null) return 0;
        
        node.val += dfs(node.left) + dfs(node.right);
        
        ret += Math.abs(node.val - 1);
        return node.val - 1;
    }
}