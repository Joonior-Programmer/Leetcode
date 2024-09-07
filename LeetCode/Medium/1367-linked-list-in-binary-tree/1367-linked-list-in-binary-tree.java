/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        return createDfs(head, root);
    }
    
    private boolean dfs(ListNode listNode, TreeNode treeNode){
        if (listNode == null) return true;
        if (treeNode == null) return false;
        
        if (listNode.val == treeNode.val) return dfs(listNode.next, treeNode.left) || dfs(listNode.next, treeNode.right);
        
        return false;
    }
    
    private boolean createDfs(ListNode listNode, TreeNode treeNode){
        if (treeNode == null) return false;
        
        if (dfs(listNode, treeNode)) return true;
        
        return createDfs(listNode, treeNode.left) || createDfs(listNode, treeNode.right);
    }
}