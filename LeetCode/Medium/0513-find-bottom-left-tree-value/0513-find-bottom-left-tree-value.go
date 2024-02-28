/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func findBottomLeftValue(root *TreeNode) int {
    depth := 0
    ret := 0
    
    dfs := func(node *TreeNode, d int) {}
    dfs = func(node *TreeNode, d int){
        if node == nil { return }
        
        if d > depth {
            depth = d
            ret = node.Val
        }
        
        dfs(node.Left, d+1)
        dfs(node.Right, d+1)
    }
    
    dfs(root, 1)
    
    return ret
}