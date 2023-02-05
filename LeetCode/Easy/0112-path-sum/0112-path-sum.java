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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return DFS(root, 0, targetSum);
    }
    
    private boolean DFS(TreeNode node, int sum, int targetSum){
        if (node != null && node.left == null && node.right == null && sum + node.val == targetSum) return true;
        if (node == null) return false;
        
        return DFS(node.left, sum + node.val, targetSum) || DFS(node.right, sum + node.val, targetSum);
    }
}