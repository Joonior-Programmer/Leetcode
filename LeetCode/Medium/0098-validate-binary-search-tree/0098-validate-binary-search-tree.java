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
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    
    private boolean validate(TreeNode node, long minVal, long maxVal){
        if (node == null) return true;
        if (node.val >= minVal || node.val <= maxVal) return false;
        
        return validate(node.left, node.val, maxVal) && validate(node.right, minVal, node.val);
    }
}