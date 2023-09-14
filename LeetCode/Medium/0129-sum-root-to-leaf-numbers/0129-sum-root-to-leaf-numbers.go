/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func sumNumbers(root *TreeNode) int {
    dfs := func(node *TreeNode, sum int) int { return 0 }
    dfs = func(node *TreeNode, sum int) int {
        if node.Left == nil && node.Right == nil { return sum * 10 + node.Val }
        ret := 0
        if node.Left != nil { ret += dfs(node.Left, sum * 10 + node.Val) }
        if node.Right != nil { ret += dfs(node.Right, sum * 10 + node.Val) }
        return ret
    }
    
    return dfs(root, 0)
}