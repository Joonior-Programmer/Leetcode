/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func findTarget(root *TreeNode, k int) bool {
    exist := make([]bool, 20001)
        
    dfs := func(node *TreeNode) bool { return true }
    dfs = func(node *TreeNode) bool { 
        if node == nil { return false }

        if abs(k - node.Val) < 10000 {
            if exist[k - node.Val + 10000] {
                return true
            }
        }

        exist[node.Val + 10000] = true

        if dfs(node.Left) { return true }
        if dfs(node.Right) { return true }
        
        return false 
    }

    return dfs(root)
}

func abs(a int) int {
    if a < 0 { return -a }
    return a
}