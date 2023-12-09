/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func inorderTraversal(root *TreeNode) []int {
    ret := make([]int, 0)
    
    dfs := func(node *TreeNode){}
    dfs = func(node *TreeNode){
        if node == nil { return }
        
        dfs(node.Left)
        ret = append(ret, node.Val)
        dfs(node.Right)
    }
    
    dfs(root)
    
    return ret
}