/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func maxDepth(root *TreeNode) int {
    return int(dfs(root, 1))
}

func dfs(node *TreeNode, depth float64) float64 {
    if node == nil { return depth - 1 }
    return math.Max(dfs(node.Left, depth+1), dfs(node.Right, depth+1))
}