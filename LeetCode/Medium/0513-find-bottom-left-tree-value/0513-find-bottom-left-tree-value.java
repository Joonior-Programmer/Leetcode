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
    int depth = 0;
    int ret = 0;
    
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 1);
        return ret;
    }
    
    private void dfs(TreeNode node, int d){
        if (node == null) return;
        
        if (d > depth){
            depth = d;
            ret = node.val;
        }
        
        dfs(node.left, d+1);
        dfs(node.right, d+1);
    }
}