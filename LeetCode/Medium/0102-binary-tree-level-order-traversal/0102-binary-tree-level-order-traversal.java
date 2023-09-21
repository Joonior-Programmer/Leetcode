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
    List<List<Integer>> ret;
    public List<List<Integer>> levelOrder(TreeNode root) {
        ret = new ArrayList();
        
        dfs(root, 0);
        
        return ret;
    }
    
    private void dfs(TreeNode node, int level){
        if (node == null) return;
        
        if (ret.size() == level){
            ret.add(new ArrayList());    
        }
        
        ret.get(level).add(node.val);
        
        dfs(node.left, level+1);
        dfs(node.right, level+1);
    }
}