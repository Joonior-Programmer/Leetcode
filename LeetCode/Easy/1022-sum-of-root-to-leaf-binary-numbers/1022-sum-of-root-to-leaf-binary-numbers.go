/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func sumRootToLeaf(root *TreeNode) int {
    dfs := func(node *TreeNode, curr int) int { return 0 }
    dfs = func(node *TreeNode, curr int) int {
        if node.Left == nil && node.Right == nil { return curr * 2 + node.Val }
        
        ret := 0
        curr = curr * 2 + node.Val
        
        if node.Left != nil { ret += dfs(node.Left, curr) }
        if node.Right != nil { ret += dfs(node.Right, curr) }
        
        return ret
    }
    
    return dfs(root, 0)
}