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
    int depth;
    int val;
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) return new TreeNode(val, root, null);
        
        this.depth = depth;
        this.val = val;
        
        dfs(root, 2);
        
        return root;
    }
    
    private void dfs(TreeNode node, int curr){
        if (node == null) return;
        
        if (curr == depth){
            TreeNode l = node.left;
            TreeNode r = node.right;
            TreeNode newL = new TreeNode(val, l, null);
            TreeNode newR = new TreeNode(val, null, r);
            node.left = newL;
            node.right = newR;
            return;
        } else {
            dfs(node.left, curr + 1);
            dfs(node.right, curr + 1);
        }
    }
}