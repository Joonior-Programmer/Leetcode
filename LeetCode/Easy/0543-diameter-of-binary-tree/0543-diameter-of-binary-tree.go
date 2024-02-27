/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func diameterOfBinaryTree(root *TreeNode) int {
    ret := 0
    dfs := func(node *TreeNode) int { return 0 }
    dfs = func(node *TreeNode) int { 
        if node == nil { return 0 }
        
        l := dfs(node.Left)
        r := dfs(node.Right)
        ret = max(ret, l + r)
        return max(l, r) + 1
    }
    
    dfs(root)
    
    return ret
}

func max(a, b int) int {
    if a > b { return a }
    return b
}