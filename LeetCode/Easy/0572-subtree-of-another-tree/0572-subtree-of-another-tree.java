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
    boolean ret = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        DFS(root, subRoot);
        return ret;
    }
    
    private void DFS(TreeNode node, TreeNode subNode) {
        if (node == null || ret) return;
        
        if (node.val == subNode.val && !ret) {
            ret = ret || isSameTree(node, subNode);
            if (ret) return;
        }
        
        DFS(node.left, subNode);
        DFS(node.right, subNode);
    }
    
    private boolean isSameTree(TreeNode node, TreeNode subNode){
        if (node == null && subNode == null) return true;
        else if (node == null || subNode == null) return false;
        
        return node.val == subNode.val && isSameTree(node.left, subNode.left) && isSameTree(node.right, subNode.right);
    }
}