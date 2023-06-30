/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func goodNodes(root *TreeNode) int {
    return dfs(root, root.Val)
}

func dfs(node *TreeNode, maxVal int) int {
    if node == nil { return 0 }
    
    ret := 0
    
    if node.Val >= maxVal { 
        maxVal = node.Val 
        ret = 1
    }
    
    return dfs(node.Left, maxVal) + dfs(node.Right, maxVal) + ret
}