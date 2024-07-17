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
    boolean[] to_delete = new boolean[1001];
    List<TreeNode> ret;
    
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        ret = new ArrayList();
        
        for (int i = 0; i < to_delete.length; ++i) this.to_delete[to_delete[i]] = true;
        
        dfs(root, !this.to_delete[root.val]);
        return ret;
    }
    
    private TreeNode dfs(TreeNode node, boolean isRoot){
        if (node == null) return null;
        
        if (isRoot && !to_delete[node.val]) ret.add(node);
        
        node.left = dfs(node.left, to_delete[node.val]);
        node.right = dfs(node.right, to_delete[node.val]);
        
        if (to_delete[node.val]) return null;
        return node;
    }
}