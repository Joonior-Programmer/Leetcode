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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList();
        dfs(root, ret, 0);
        return ret;
    }

    private void dfs(TreeNode node, List<Integer> ret,int level){
        if (node == null) return;
        if (ret.size() == level) ret.add(node.val);

        dfs(node.right, ret, level+1);
        dfs(node.left, ret, level+1);
    }
}