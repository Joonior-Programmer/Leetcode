/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func isSubPath(head *ListNode, root *TreeNode) bool {
    dfs := func(treeNode *TreeNode, listNode *ListNode) bool { return true }
    dfs = func(treeNode *TreeNode, listNode *ListNode) bool { 
        if listNode == nil { return true }
        if treeNode == nil { return false }

        if treeNode.Val == listNode.Val {
            return dfs(treeNode.Left, listNode.Next) || dfs(treeNode.Right, listNode.Next)
        }

        return false
    }

    create_dfs := func(node *TreeNode) bool { return true }
    create_dfs = func(node *TreeNode) bool {
        if node == nil { return false }
        if dfs(node, head) { return true }
        return create_dfs(node.Left) || create_dfs(node.Right)
    }

    return create_dfs(root)
}