/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func rightSideView(root *TreeNode) []int {
    ret := make([]int, 0)
    dfs(root, &ret, 0)
    return ret
}

func dfs(node *TreeNode, ret *[]int, level int) {
    if node == nil { return }
    if len(*ret) == level { *ret = append(*ret, node.Val) }
    
    dfs(node.Right, ret, level + 1)
    dfs(node.Left, ret, level + 1)
}