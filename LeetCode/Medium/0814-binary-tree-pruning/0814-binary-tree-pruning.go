/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func pruneTree(root *TreeNode) *TreeNode {
    dfs(root)
    
    if root.Val == 0 && root.Left == nil && root.Right == nil { return nil }
    return root
}

func dfs(node *TreeNode) bool {
    if node == nil { return false }
    
    left := dfs(node.Left)
    right := dfs(node.Right)
    
    if !left { node.Left = nil }
    if !right { node.Right = nil }
    
    return node.Val == 1 || left || right
}