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
    public int maxDepth(TreeNode root) {
        return DFS(root, 1);
    }
    
    private int DFS(TreeNode node, int depth) {
        if (node == null) return depth-1;
        return Math.max(DFS(node.left, depth+1), DFS(node.right, depth+1));
    }
}