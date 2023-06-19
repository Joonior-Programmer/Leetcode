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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode head = new TreeNode();
        TreeNode prev = head;
        TreeNode curr = root;
        head.left = root;
        boolean isLeft = true;
        
        while (curr != null && curr.val != key){
            prev = curr;
            if (curr.val > key){
                isLeft = true;
                curr = curr.left;
            } else {
                isLeft = false;
                curr = curr.right;
            }
        }
        
        if (curr == null) return root;
        
        if (curr.right == null){
            if (isLeft) prev.left = curr.left;
            else prev.right = curr.left;
        } else {
            TreeNode temp = curr.right;
            
            while (temp.left != null) temp = temp.left;
            temp.left = curr.left;
            
            if (isLeft) prev.left = curr.right;
            else prev.right = curr.right;
        }
        
        return head.left;
    }
}