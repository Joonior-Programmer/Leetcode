/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func longestZigZag(root *TreeNode) int {
    ret := 0
    DFS(root, 0, 0, &ret)
    return ret - 1
}

func DFS(node *TreeNode, left int, right int, ret *int) {
    if node == nil { 
        *ret = max(*ret, max(left, right))
        return 
    }

    DFS(node.Left, right + 1, 0, ret)
    DFS(node.Right, 0, left + 1, ret)
}

func max(a int, b int) int {
    if a > b {
        return a
    }
    return b
}