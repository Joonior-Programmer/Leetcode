/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func flipEquiv(root1 *TreeNode, root2 *TreeNode) bool {
    dfs := func(node1, node2 *TreeNode) bool { return false }
    dfs = func(node1, node2 *TreeNode) bool {
        if node1 == nil && node2 == nil {
            return true
        } else if node1 == nil {
            return false
        } else if node2 == nil {
            return false
        }

        if node1.Val != node2.Val { return false }

        l1, l2 := -1, -1
        
        if node1.Left != nil { l1 = node1.Left.Val }
        if node2.Left != nil { l2 = node2.Left.Val }

        if l1 == l2 {
            return dfs(node1.Left, node2.Left) && dfs(node1.Right, node2.Right)
        }
        return dfs(node1.Left, node2.Right) && dfs(node1.Right, node2.Left)
    }

    return dfs(root1, root2)
}