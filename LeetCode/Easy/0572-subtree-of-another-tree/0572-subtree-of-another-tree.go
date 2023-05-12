/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func isSubtree(root *TreeNode, subRoot *TreeNode) bool {
    ret := false
    DFS(root, subRoot, &ret) 
    return ret
}

func DFS(node *TreeNode, subNode *TreeNode, ret *bool) {
    if node == nil || *ret { return }
    
    if node.Val == subNode.Val { 
        *ret = *ret || isSameTree(node, subNode)
        if *ret { return }
    }
    
    DFS(node.Left, subNode, ret)
    
    if *ret { return }
    
    DFS(node.Right, subNode, ret)
}

func isSameTree(node *TreeNode, subNode * TreeNode) bool {
    if node == nil && subNode == nil { return true }
    if node == nil || subNode == nil { return false }
    return node.Val == subNode.Val && isSameTree(node.Left, subNode.Left) && isSameTree(node.Right, subNode.Right)
}
