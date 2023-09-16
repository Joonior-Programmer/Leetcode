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
    int idx;
    int[] postorder;
    int[] inorderIdx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        inorderIdx = new int[6001];
        
        for (int i = 0; i < inorder.length; ++i) inorderIdx[inorder[i]+3000] = i;
        
        idx = inorder.length-1;
        
        return createTree(0, inorder.length - 1);
    }
    
    private TreeNode createTree(int left, int right){
        if (left > right) return null;
        
        int nodeVal = postorder[idx--];
        TreeNode node = new TreeNode(nodeVal);
        
        node.right = createTree(inorderIdx[nodeVal + 3000] + 1, right);
        node.left = createTree(left, inorderIdx[nodeVal + 3000] - 1);
        
        return node;
    }
}