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
    boolean[] exist;
    int k;
    
    public boolean findTarget(TreeNode root, int k) {
        exist = new boolean[20001];
        this.k = k;
        
        return dfs(root);
    }
    
    private boolean dfs(TreeNode node){
        if (node == null) return false;

        if (Math.abs(k - node.val) < 10000)
            if (exist[k - node.val + 10000])
                return true;

        exist[node.val + 10000] = true;

        if (dfs(node.left)) return true;
        if (dfs(node.right)) return true;
        
        return false;
    }
}