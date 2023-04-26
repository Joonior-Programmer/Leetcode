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
    int prev = Integer.MIN_VALUE;
    int ret = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        DFS(root);
        return ret;
    }
    
    private void DFS(TreeNode node){
        if (node == null) return;
        DFS(node.left);
        if (node.val - prev > 0 && node.val - prev < ret) ret = node.val - prev;
        prev = node.val;
        DFS(node.right);
    }
}