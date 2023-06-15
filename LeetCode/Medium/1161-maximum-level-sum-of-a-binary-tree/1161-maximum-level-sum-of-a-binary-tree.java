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
    int[] sum = new int[10001];
    int maxLevel = 1;

    public int maxLevelSum(TreeNode root) {
        DFS(root, 1);
        int ret = 1;
        int max_sum = sum[1];
        for (int i = 2; i < maxLevel+1; ++i){
            if (sum[i] > max_sum){
                ret = i;
                max_sum = sum[i];
            }
        }
        return ret;

        // BFS Solution
        // Queue<TreeNode> q = new LinkedList<>();
        // q.offer(root);
        
        // int cur = 0;
        // int ret = 0;
        // int maxSum = Integer.MIN_VALUE;
        
        // while (!q.isEmpty()){
        //     ++cur;
        //     Queue<TreeNode> temp = new LinkedList<>();
        //     int tempSum = 0;
        //     while (!q.isEmpty()){
        //         TreeNode node = q.poll();
        //         tempSum += node.val;
        //         if (node.left != null) temp.offer(node.left);
        //         if (node.right != null) temp.offer(node.right);
        //     }
            
        //     if (tempSum > maxSum) {
        //         maxSum = tempSum;
        //         ret = cur;
        //     }
        //     q = temp;
        // }
        // return ret;
    }

    private void DFS(TreeNode node, int level){
        if (node == null) return;
        if (level > maxLevel) maxLevel = level;
        sum[level] += node.val;
        DFS(node.left, level+1);
        DFS(node.right, level+1);
    }
}