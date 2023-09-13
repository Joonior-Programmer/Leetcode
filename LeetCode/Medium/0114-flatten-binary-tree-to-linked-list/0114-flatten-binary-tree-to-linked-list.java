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
    TreeNode dummy;
    public void flatten(TreeNode root) {
        dummy = new TreeNode();
        
        postOrder(root);
    }
    
    private void postOrder(TreeNode node){
        if (node == null) return;
        
        postOrder(node.right);
        postOrder(node.left);
        node.right = dummy.right;
        node.left = null;
        dummy.right = node;
    }
}