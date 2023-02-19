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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null){
            return ret;
        }
        List<TreeNode> prev = new ArrayList<>();
        
        prev.add(root);
       
        boolean isLeft = true;
        while (!prev.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            List<TreeNode> tempPrev = new ArrayList<>();
            for (int i = 0; i < prev.size(); ++i){
                temp.add(prev.get(i).val);
                if (prev.get(i).left != null){
                    tempPrev.add(prev.get(i).left);
                }
                if (prev.get(i).right != null){
                    tempPrev.add(prev.get(i).right);
                }
            }
            if (!isLeft){
                Collections.reverse(temp);
            }
            ret.add(temp);
            prev = tempPrev;
            isLeft = !isLeft;
        }
        return ret;
    }
}