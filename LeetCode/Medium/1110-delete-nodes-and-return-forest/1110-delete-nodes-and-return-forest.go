/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func delNodes(root *TreeNode, to_delete []int) []*TreeNode {
    ret := make([]*TreeNode, 0)
    del := make([]bool, 1001)

    for i := 0; i < len(to_delete); i++ { del[to_delete[i]] = true } 
    
    dfs := func(node *TreeNode, isRoot bool) *TreeNode { return nil }
    dfs = func(node *TreeNode, isRoot bool) *TreeNode {
        if node == nil { return nil }

        if isRoot && !del[node.Val]{
            ret = append(ret, node)
        }

        node.Left = dfs(node.Left, del[node.Val])
        node.Right = dfs(node.Right, del[node.Val])

        if del[node.Val] { return nil }
        
        return node
    }
    
    dfs(root, !del[root.Val])

    return ret
}