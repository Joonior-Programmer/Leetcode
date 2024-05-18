/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func distributeCoins(root *TreeNode) int {
    ret := 0
    
    dfs := func(node *TreeNode) int { return 0 }
    dfs = func(node *TreeNode) int { 
        if node == nil { return 0 }
        
        node.Val += dfs(node.Left) + dfs(node.Right) - 1
        ret += abs(node.Val)
        return node.Val
    }
    
    dfs(root)
    
    return ret
}

func abs(a int) int {
    if a < 0 { return -a }
    return a
    
}