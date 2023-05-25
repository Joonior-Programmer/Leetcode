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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ret1 = DFS(root1, new ArrayList<Integer>());
        ArrayList<Integer> ret2 = DFS(root2, new ArrayList<Integer>());
        if (ret1.size() != ret2.size()) return false;
        for (int i = 0; i < ret1.size(); ++i) {
            if (ret1.get(i) != ret2.get(i)) return false;
        }
        return true;
    }
    
    private ArrayList<Integer> DFS(TreeNode node, ArrayList<Integer> ret){
        if (node == null) return ret;
        if (node.left == null && node.right == null) ret.add(node.val);
        DFS(node.left, ret);
        DFS(node.right, ret);
        return ret;
    }
}