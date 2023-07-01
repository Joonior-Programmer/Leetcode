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
    private HashMap<Long, Integer> lookup = new HashMap<>();
    private int targetSum;
    
    public int pathSum(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        lookup.put((long) 0, 1);
        return DFS(root, 0);
    }
    
    private int DFS(TreeNode node, long currSum){
        int count = 0;
        
        if (node != null){
            currSum += node.val;
            count = lookup.getOrDefault(currSum - targetSum, 0);
            lookup.put(currSum, lookup.getOrDefault(currSum, 0) + 1);
            count += DFS(node.left, currSum) + DFS(node.right, currSum);
            lookup.put(currSum, lookup.get(currSum) - 1);
        }
        
        return count;
    }
}