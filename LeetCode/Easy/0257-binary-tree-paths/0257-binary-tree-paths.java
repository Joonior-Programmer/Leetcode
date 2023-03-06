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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ret = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        inOrder(root, sb, ret);
        return ret;
    }
    
    private void inOrder(TreeNode node, StringBuilder sb, ArrayList<String> ret){
        if (node == null) return;
        if (node.left == null && node.right == null){
            if (sb.length() == 0) ret.add(Integer.toString(node.val));
            else {
                sb.append("->");
                sb.append(Integer.toString(node.val));
                ret.add(sb.toString());
                return;
            }
        }
        
        if (sb.length() == 0) sb.append(Integer.toString(node.val));
        else {
            sb.append("->");
            sb.append(Integer.toString(node.val));
        }
        inOrder(node.left, new StringBuilder(sb), ret);
        inOrder(node.right, new StringBuilder(sb), ret);
    }
}