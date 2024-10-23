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
    int[] levelSum;
    
    public TreeNode replaceValueInTree(TreeNode root) {
        levelSum = new int[100000];
        
        addDfs(root, 0);
        dfs(root, 0, root.val);
        
        return root;
    }
    
    private void addDfs(TreeNode node, int level){
        if (node == null) return;
        
        levelSum[level] += node.val;
        
        addDfs(node.left, level + 1);
        addDfs(node.right, level + 1);
    }
    
    private void dfs(TreeNode node, int level, int childrenSum){
        if (node == null) return;
        
        node.val = levelSum[level] - childrenSum;
        
        int nextSum = 0;
        if (node.left != null) nextSum += node.left.val;
        if (node.right != null) nextSum += node.right.val;
        
        dfs(node.left, level + 1, nextSum);
        dfs(node.right, level + 1, nextSum);
    }
}