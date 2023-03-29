/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func sumOfLeftLeaves(root *TreeNode) int {
    if root == nil { return 0}
    
    temp := 0
    
    if root.Left != nil && root.Left.Left == nil && root.Left.Right == nil {
        temp += root.Left.Val
        temp += sumOfLeftLeaves(root.Right)
    } else {
        temp += sumOfLeftLeaves(root.Left)
        temp += sumOfLeftLeaves(root.Right)
    }
    return temp
}