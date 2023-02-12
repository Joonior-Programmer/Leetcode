/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func postorderTraversal(root *TreeNode) []int {
    var ret []int
    postOrder(root, &ret)
    return ret
}

func postOrder(node *TreeNode, container *[]int) {
    if node == nil { return }
    postOrder(node.Left, container)
    postOrder(node.Right, container)
    *container = append(*container, node.Val)
    return
}