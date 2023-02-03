/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func isBalanced(root *TreeNode) bool {
    if root == nil {return true}
    return checkDepth(root) != -1
}

func checkDepth(node *TreeNode) float64 {
    if node == nil {return 0}
    
    left := checkDepth(node.Left)
    right := checkDepth(node.Right)
    
    if (left == -1 || right == -1) { return -1 }
    if (math.Abs(left - right) > 1) { return -1 }
    
    return math.Max(left,right) + 1
}