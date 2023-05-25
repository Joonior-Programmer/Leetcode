/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func leafSimilar(root1 *TreeNode, root2 *TreeNode) bool {
    ret1 := make([]int, 0)
    DFS(root1, &ret1)

    ret2 := make([]int, 0)
    DFS(root2, &ret2)

    if len(ret1) != len(ret2) { return false }
    
    for i := 0; i < len(ret1); i++ {
        if ret1[i] != ret2[i] { return false }
    }
    
    return true
}

func DFS(node *TreeNode, ret *[]int) {
    if node == nil { return }
    
    if node.Left == nil && node.Right == nil { *ret = append(*ret, node.Val) }
    
    DFS(node.Left, ret)
    DFS(node.Right, ret)
    
    return
}