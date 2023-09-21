/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func levelOrder(root *TreeNode) [][]int {
    ret := make([][]int, 0)
    
    dfs := func(node *TreeNode, level int){}
    dfs = func(node *TreeNode, level int){
        if node == nil { return }
        
        if len(ret) == level { ret = append(ret, make([]int, 0)) }
        
        ret[level] = append(ret[level], node.Val)
        dfs(node.Left, level+1)
        dfs(node.Right, level+1)
    }
    
    dfs(root, 0)
    
    return ret
}