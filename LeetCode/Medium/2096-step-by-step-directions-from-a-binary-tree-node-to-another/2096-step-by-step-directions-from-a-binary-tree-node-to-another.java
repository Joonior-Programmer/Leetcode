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
    int startValue;
    int destValue;
    
    public String getDirections(TreeNode root, int startValue, int destValue) {
        this.startValue = startValue;
        this.destValue = destValue;
        
        TreeNode lca = lca(root);
        StringBuilder s = new StringBuilder();
        StringBuilder d = new StringBuilder();
        
        search(lca, startValue, s);
        search(lca, destValue, d);

        return "U".repeat(s.length()) + d.toString();
    }
    
    private TreeNode lca(TreeNode node){
        if (node == null) return null;
        
        if (node.val == startValue || node.val == destValue) return node;
        
        TreeNode l = lca(node.left);
        TreeNode r = lca(node.right);
        
        if (l != null && r != null) return node;
        else if (l != null) return l;
        else if (r != null) return r;
        
        return null;
    }
    
    private boolean search(TreeNode node, int v, StringBuilder curr){
        if (node == null) return false;
        
        if (node.val == v) return true;
        
        curr.append("L");
        if (search(node.left, v, curr)) return true;
        
        curr.setLength(curr.length() - 1);
        
        curr.append("R");
        if (search(node.right, v, curr)) return true;
        
        curr.setLength(curr.length() - 1);
        
        return false;
        
    }
}