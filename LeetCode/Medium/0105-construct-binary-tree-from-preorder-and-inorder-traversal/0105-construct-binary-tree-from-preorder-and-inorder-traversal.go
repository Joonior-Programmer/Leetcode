/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func buildTree(preorder []int, inorder []int) *TreeNode {
    inorderIdx := make([]int, 6001)
    
    for i := 0; i < len(inorder); i++ { inorderIdx[inorder[i] + 3000] = i }
    
    i := 0
    
    createTree := func(left, right int) *TreeNode { return nil }
    createTree = func(left, right int) *TreeNode { 
        if left > right { return nil }
        
        nodeVal := preorder[i]
        node := &TreeNode{nodeVal, nil, nil}
        i++
        
        node.Left = createTree(left, inorderIdx[nodeVal + 3000] - 1)
        node.Right = createTree(inorderIdx[nodeVal + 3000] + 1, right)
        
        return node
    }
    
    return createTree(0, len(inorder) - 1)
}