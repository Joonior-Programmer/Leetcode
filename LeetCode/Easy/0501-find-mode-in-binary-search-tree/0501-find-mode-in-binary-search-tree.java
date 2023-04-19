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
    HashMap<Integer, Integer> count = new HashMap<>();
    
    public int[] findMode(TreeNode root) {
        DFS(root);
        
        int max_val = 0;
        int val_count = 0;
        for (int value: count.values()) {
            if (value > max_val){
                max_val = value;
                val_count = 1;
            } else if (max_val == value) ++val_count;
        }
        
        int[] ret = new int[val_count];
        int i = 0;
        for (int key: count.keySet()) {
            if (count.get(key) == max_val){
                ret[i++] = key;
            }
        }
        
        return ret;
    }
    
    private void DFS(TreeNode node){
        if (node == null) return;
        count.put(node.val, count.getOrDefault(node.val, 0) + 1);
        DFS(node.left);
        DFS(node.right);
    }
}