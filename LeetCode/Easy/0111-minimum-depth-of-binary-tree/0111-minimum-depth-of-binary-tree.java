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
    public int minDepth(TreeNode root) {
        return DFS(root, 1);
    }
    
    private int DFS(TreeNode node, int depth){
        if (node == null) return depth - 1;
        
        int left = DFS(node.left, depth + 1);
        int right = DFS(node.right, depth + 1);
        
        if (left == depth) return right;
        else if (right == depth) return left;
        
        return Math.min(left, right);
        
    }
}