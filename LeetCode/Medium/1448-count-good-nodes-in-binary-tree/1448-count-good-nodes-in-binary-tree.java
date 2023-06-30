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
    public int goodNodes(TreeNode root) {
        return DFS(root, root.val);
    }
    
    private int DFS(TreeNode node, int maxVal){
        if (node == null) return 0;
        
        maxVal = Math.max(node.val, maxVal);
        
        return DFS(node.left, maxVal) + 
                DFS(node.right, maxVal) + (node.val >= maxVal ? 1 : 0);
    }
}