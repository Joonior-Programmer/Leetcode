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
    ArrayList<ArrayList<Integer>> vals;
    
    public String smallestFromLeaf(TreeNode root) {
        vals = new ArrayList();
        
        dfs(root, new ArrayList<>());
        vals.sort((a, b) -> {
            int size = Math.min(a.size(), b.size());
            for (int i = 0; i < size; i++) {
                int cmp = a.get(i).compareTo(b.get(i));
                if (cmp != 0)
                    return cmp;
            }
            return Integer.compare(a.size(), b.size());
        });

        StringBuilder result = new StringBuilder();
        for (int v : vals.get(0))
            result.append((char) (v + 97));

        return result.toString();
    }

    private void dfs(TreeNode node, List<Integer> curr) {
        if (node == null) return;

        curr.add(node.val);
        if (node.left == null && node.right == null) {
            ArrayList<Integer> path = new ArrayList<>(curr);
            Collections.reverse(path);
            vals.add(path);
            
        }

        dfs(node.left, curr);
        dfs(node.right, curr);
        curr.remove(curr.size() - 1);
    }
}