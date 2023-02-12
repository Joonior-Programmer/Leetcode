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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        postOrder(root, ret);
        return ret;
    }
    
    private void postOrder(TreeNode node, List container){
        if (node == null){
            return;
        }
        postOrder(node.left, container);
        postOrder(node.right, container);
        container.add(node.val);
        return;
    }
}