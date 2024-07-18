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
    int distance;
    int ret = 0;
    public int countPairs(TreeNode root, int distance) {
        this.distance = distance;
        
        dfs(root);
        
        return ret;
    }
    
    private int[] dfs(TreeNode node){
        if (node == null) return new int[0];
        
        int[] l = dfs(node.left);
        int[] r = dfs(node.right);
        
        int n = l.length;
        int m = r.length;
        
        if (n + m == 0) return new int[]{1};
        
        for (int v0 : l){
            if (v0 >= distance) continue;
            
            for (int v1 : r)
                if (v0 + v1 <= distance) ++ret;
        }
        
        int i = 0;
        int[] returnVal = new int[n+m];
        
        for (int j = 0; j < n; j++) returnVal[i++] = l[j] + 1;
        for (int j = 0; j < m; j++) returnVal[i++] = r[j] + 1;
        
        return returnVal;
    }
}