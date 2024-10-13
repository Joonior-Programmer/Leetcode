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
    HashSet<Integer> exist;
    int first;
    int second;
    public int findSecondMinimumValue(TreeNode root) {
        exist = new HashSet();
        first = Integer.MAX_VALUE;
        second = Integer.MAX_VALUE;
        
        dfs(root);
        
        if (exist.size() == 1) return -1;
        
        return second;
    }
    
    private void dfs(TreeNode node){
        if (node == null) return;
        
        if (!exist.contains(node.val)){
            if (node.val < first){
                second = first;
                first = node.val;
            } else if (node.val < second) second = node.val;
            
            exist.add(node.val);
        }
        
        dfs(node.left);
        dfs(node.right);
    }
}