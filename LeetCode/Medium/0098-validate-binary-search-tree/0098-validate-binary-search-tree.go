/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func isValidBST(root *TreeNode) bool {
    validate := func(node *TreeNode, minVal, maxVal int ) bool { return true }
    validate = func(node *TreeNode, minVal, maxVal int ) bool { 
        if node == nil { return true }
        if node.Val <= maxVal || node.Val >= minVal { return false }
        
        return validate(node.Left, node.Val, maxVal) && validate(node.Right, minVal, node.Val)
    }
    
    return validate(root, math.MaxInt, math.MinInt)
}