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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int curr){
        if (node.left == null && node.right == null) return curr * 2 + node.val;
        
        int ret = 0;
        curr = curr * 2 + node.val;
        
        if (node.left != null) ret += dfs(node.left, curr);
        if (node.right != null) ret += dfs(node.right, curr);
        
        return ret;
    }
}