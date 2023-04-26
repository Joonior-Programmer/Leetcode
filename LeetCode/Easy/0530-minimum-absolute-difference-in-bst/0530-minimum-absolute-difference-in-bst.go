/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func getMinimumDifference(root *TreeNode) int {
    prev, ret := math.MaxInt, math.MaxInt
    var DFS func (node *TreeNode) 
    DFS = func (node *TreeNode){
        if node == nil {return}
        DFS(node.Left)
        if node.Val - prev > 0 && node.Val - prev < ret {ret = node.Val - prev}
        prev = node.Val
        DFS(node.Right)
    }
    DFS(root)
    return ret
}

