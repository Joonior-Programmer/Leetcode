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
    StringBuilder ret = new StringBuilder();
    
    public String tree2str(TreeNode root) {    
        preOrder(root);
        return ret.toString();
    }
    
    private void preOrder(TreeNode node){
        if (node == null) return;
        
        ret.append(String.valueOf(node.val));
        
        if (node.left != null){
            ret.append("(");
            preOrder(node.left);
            ret.append(")");
        } else if (node.right != null){
            ret.append("()(");
            preOrder(node.right);
            ret.append(")");
        }
        
        if (node.left != null && node.right != null){
            ret.append("(");
            preOrder(node.right);
            ret.append(")");
        }
    }
}