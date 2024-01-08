/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func rangeSumBST(root *TreeNode, low int, high int) int {
    if root == nil { return 0 }
    
    ret := 0
    val := root.Val
    
    if val >= low && val <= high { ret += val }
    
    if val > low { ret += rangeSumBST(root.Left, low, high) }
    
    if val < high { ret += rangeSumBST(root.Right, low, high) }
    
    return ret
}