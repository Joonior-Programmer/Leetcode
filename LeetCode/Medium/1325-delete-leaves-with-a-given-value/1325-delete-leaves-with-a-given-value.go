/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func removeLeafNodes(root *TreeNode, target int) *TreeNode {
    if root == nil { return root }
    
    if root.Left != nil { root.Left = removeLeafNodes(root.Left, target) } 
    if root.Right != nil { root.Right = removeLeafNodes(root.Right, target) }
    
    if root.Left == nil && root.Right == nil && root.Val == target { 
        root = nil
    }

    return root
}