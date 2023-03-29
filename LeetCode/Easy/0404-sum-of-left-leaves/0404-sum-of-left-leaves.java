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
    public int sumOfLeftLeaves(TreeNode root) {
        return DFS(root);
    }
    
    private int DFS(TreeNode node){
        if (node == null) return 0;
        
        int temp = 0;
        if (node.left != null && node.left.left == null && node.left.right == null){
            temp += node.left.val;
            temp += DFS(node.right);
        } else {
            temp += DFS(node.left);
            temp += DFS(node.right);
        }
        return temp;
    }
}