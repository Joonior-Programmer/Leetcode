/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func buildTree(inorder []int, postorder []int) *TreeNode {
    idx := len(postorder) - 1
    inorderIdx := make([]int, 6001)
    
    for i := 0; i < idx + 1; i++ { inorderIdx[inorder[i] + 3000] = i }
    
    createTree := func(left, right int) *TreeNode {return nil}
    createTree = func(left, right int) *TreeNode {
        if left > right { return nil }
        
        nodeVal := postorder[idx]
        idx--
        node := &TreeNode{nodeVal, nil, nil}
        
        node.Right = createTree(inorderIdx[nodeVal + 3000] + 1, right)
        node.Left = createTree(left, inorderIdx[nodeVal + 3000] - 1)
        
        return node
    }
    
    return createTree(0, idx)
    
}