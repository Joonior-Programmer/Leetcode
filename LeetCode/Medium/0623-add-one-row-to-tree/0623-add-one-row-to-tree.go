/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func addOneRow(root *TreeNode, val int, depth int) *TreeNode {
    if depth == 1 { return &TreeNode{val, root, nil} }
    
    dfs := func(node *TreeNode, curr int){}
    dfs = func(node *TreeNode, curr int){
        if node == nil { return }
        
        if curr == depth {
            l := node.Left
            r := node.Right
            newL := &TreeNode{val, l, nil}
            newR := &TreeNode{val, nil, r}
            node.Left = newL
            node.Right = newR
            return
        } else {
            dfs(node.Left, curr + 1)
            dfs(node.Right, curr + 1)
        }
    }
    
    dfs(root, 2)
    
    return root
}