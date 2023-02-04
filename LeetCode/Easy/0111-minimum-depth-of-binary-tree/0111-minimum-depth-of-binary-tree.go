/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func minDepth(root *TreeNode) int {
    return int(dfs(root, 1))
}

func dfs(node *TreeNode, depth float64) float64 {
    if node == nil {return depth - 1}
    
    left := dfs(node.Left, depth+1)
    right := dfs(node.Right, depth + 1)
    
    if left == depth { return right }
    if right == depth { return left }
    
    return math.Min(left, right)
    
}