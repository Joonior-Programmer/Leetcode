/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func kthSmallest(root *TreeNode, k int) int {
    ret := make([]int, k)
    idx := 0

    dfs := func(node *TreeNode){}
    dfs = func(node *TreeNode){
        if node == nil { return }

        dfs(node.Left)
        
        if idx < k {
            ret[idx] = node.Val
            idx++
        } else { return }

        dfs(node.Right)
    }

    dfs(root)

    return ret[k-1]
}