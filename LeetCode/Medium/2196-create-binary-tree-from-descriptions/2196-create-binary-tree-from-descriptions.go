/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func createBinaryTree(descriptions [][]int) *TreeNode {
    nodes := make([]*TreeNode, 100001)
    child := make(map[int]bool)
    
    for _, v := range descriptions {
        p, c := v[0], v[1]
        
        if nodes[p] == nil {
            nodes[p] = &TreeNode{Val: p}
        }
        if nodes[c] == nil {
            nodes[c] = &TreeNode{Val: c}
        }
        
        child[c] = true
        
        if v[2] == 1 {
            nodes[p].Left = nodes[c]
        } else {
            nodes[p].Right = nodes[c]
        }
    }
    
    var root *TreeNode
    for _, v := range descriptions {
        if !child[v[0]] {
            root = nodes[v[0]]
            break
        }
    }
    
    return root
}