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
    int[] ret;
    int idx;
    int k;
    public int kthSmallest(TreeNode root, int k) {
        ret = new int[k];
        this.k = k;
        
        dfs(root);
        
        return ret[k-1];
    }
    
    private void dfs(TreeNode node){
        if (node == null) return;
        
        dfs(node.left);
        
        if (idx < k) ret[idx++] = node.val;
        else return;
        
        dfs(node.right);
    }
}