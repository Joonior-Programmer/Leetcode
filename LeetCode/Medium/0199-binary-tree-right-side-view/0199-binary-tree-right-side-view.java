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
        
        Queue<TreeNode> q = new LinkedList();
        
        if (root != null) q.offer(root);
        
        while (!q.isEmpty()){
            ret.add(q.peek().val);
            
            Queue<TreeNode> tempQ = new LinkedList();
            
            while (!q.isEmpty()){
                TreeNode temp = q.poll();
                if (temp.right != null) tempQ.offer(temp.right);
                if (temp.left != null) tempQ.offer(temp.left);
            }
            
            q = tempQ;
        }
        
        return ret;
    }
}