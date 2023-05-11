/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

var ret int = 0

func findTilt(root *TreeNode) int {
    ret = 0
    DFS(root)

    return ret
}

func DFS(node *TreeNode) int {
    if node == nil { return 0 }
    
    left := DFS(node.Left)
    right := DFS(node.Right)
    
    diff := left - right
    
    if diff < 0 { diff *= -1 }
    
    ret += diff
    
    return left + right + node.Val
}