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
    public int pseudoPalindromicPaths (TreeNode root) {
        return dfs(root, new int[10]);
    }
    
    private int dfs(TreeNode node, int[] count){
        ++count[node.val];
        
        if (node.left == null && node.right == null){
            boolean isOddExist = false;
            boolean isPalindrome = true;
            
            for (int i = 1; i < 10; ++i){
                if (count[i] % 2 == 1){
                    if (isOddExist) {
                        count[node.val]--;
                        return 0;
                    }
                    isOddExist = true;
                }
            }

            count[node.val]--;
            
            return 1;
        }
        
        int ret = 0;
        
        if (node.left != null) ret += dfs(node.left, count);
        if (node.right != null) ret += dfs(node.right, count);
        
        count[node.val]--;
        
        return ret;
    }
}