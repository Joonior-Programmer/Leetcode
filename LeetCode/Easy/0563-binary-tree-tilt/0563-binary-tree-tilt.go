/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func findTilt(root *TreeNode) int {
    ret := 0
    DFS(root, &ret)

    return ret
}

func DFS(node *TreeNode, ret *int) int {
    if node == nil { return 0 }
    
    left := DFS(node.Left, ret)
    right := DFS(node.Right, ret)
    
    diff := left - right
    
    if diff < 0 { diff = -diff }
    
    *ret += diff
    
    return left + right + node.Val
}