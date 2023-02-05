/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func hasPathSum(root *TreeNode, targetSum int) bool {
    return dfs(root, 0, targetSum)
}

func dfs(node *TreeNode, sum int, targetSum int) bool {
    if (node != nil && node.Left == nil && node.Right == nil && sum + node.Val == targetSum) { return true }
    if (node == nil) { return false }
    
    return dfs(node.Left, sum + node.Val, targetSum) || dfs(node.Right, sum+node.Val, targetSum)
}