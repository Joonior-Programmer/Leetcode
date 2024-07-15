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
    public TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode[] nodes = new TreeNode[100001];
        HashSet<Integer> child = new HashSet();
        int ret = 0;
        
        for (int[] v : descriptions){
            int p = v[0];
            int c = v[1];
            if (nodes[p] == null) nodes[p] = new TreeNode(p);
            if (nodes[c] == null) nodes[c] = new TreeNode(c);
            
            child.add(c);
            
            if (v[2] == 1) nodes[p].left = nodes[c];
            else nodes[p].right = nodes[c];
        }
        
        for (int[] v : descriptions)
            if (!child.contains(v[0])) {
                ret = v[0];
                break;
            }
        
        return nodes[ret];
    }
}