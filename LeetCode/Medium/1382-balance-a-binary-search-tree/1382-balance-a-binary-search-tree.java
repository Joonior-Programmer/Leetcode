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
    ArrayList<TreeNode> arr;
    
    public TreeNode balanceBST(TreeNode root) {
        arr = new ArrayList();
        inorder(root);
        
        return make(0, arr.size()-1);
    }
    
    private void inorder(TreeNode node){
        if (node == null) return;
        
        inorder(node.left);
        arr.add(node);
        inorder(node.right);
    }
    
    private TreeNode make(int l, int r){
        if (l > r) return null;
        
        int mid = (l + r) / 2;
        
        TreeNode curr = arr.get(mid);
        curr.left = make(l, mid-1);
        curr.right = make(mid + 1, r);
        
        return curr;
    }
}