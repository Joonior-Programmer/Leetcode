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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return dfs(root1, root2);
    }
    
    private boolean dfs(TreeNode node1, TreeNode node2){
        if (node1 == null && node2 == null) return true;
        else if (node1 == null) return false;
        else if (node2 == null) return false;
        
        if (node1.val != node2.val) return false;
        
        int l1 = node1.left != null ? node1.left.val : -1;
        int l2 = node2.left != null ? node2.left.val : -1;
        int r1 = node1.right != null ? node1.right.val : -1;
        int r2 = node2.right != null ? node2.right.val : -1;
        
        if (l1 == l2) return dfs(node1.left, node2.left) && dfs(node1.right, node2.right);
        return dfs(node1.left, node2.right) && dfs(node1.right, node2.left);
    }
}