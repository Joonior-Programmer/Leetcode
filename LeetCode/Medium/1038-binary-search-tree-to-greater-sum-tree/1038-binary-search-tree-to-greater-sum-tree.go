/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func bstToGst(root *TreeNode) *TreeNode {
    curr := 0
    
    dfs := func(node *TreeNode) {}
    dfs = func(node *TreeNode) {
        if node == nil { return }
        
        dfs(node.Right)
        curr += node.Val
        node.Val = curr
        dfs(node.Left)
    }
    
    dfs(root)
    
    return root
}