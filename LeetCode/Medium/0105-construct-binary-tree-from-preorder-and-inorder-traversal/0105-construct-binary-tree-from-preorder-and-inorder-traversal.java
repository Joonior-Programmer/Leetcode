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
    int[] inorderIdx;
    int idx = 0;
    int[] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderIdx = new int[6001];
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; ++i) inorderIdx[inorder[i]+3000] = i;
        
        return createTree(0, preorder.length - 1);
    }
    
    private TreeNode createTree(int left, int right){
        if (left > right) return null;
        
        int nodeVal = preorder[idx++];
        TreeNode node = new TreeNode(nodeVal);
        
        node.left = createTree(left, inorderIdx[nodeVal+3000] - 1);
        node.right = createTree(inorderIdx[nodeVal + 3000] + 1, right);
        
        return node;
    }
}