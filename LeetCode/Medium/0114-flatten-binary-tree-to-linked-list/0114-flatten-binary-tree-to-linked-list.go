/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func flatten(root *TreeNode)  {
    dummy := &TreeNode{}
    
    postOrder := func(node *TreeNode){}
    postOrder = func(node *TreeNode){
        if node == nil { return }
        postOrder(node.Right)
        postOrder(node.Left)
        node.Right = dummy.Right
        node.Left = nil
        dummy.Right = node
    }
    
    postOrder(root)
}