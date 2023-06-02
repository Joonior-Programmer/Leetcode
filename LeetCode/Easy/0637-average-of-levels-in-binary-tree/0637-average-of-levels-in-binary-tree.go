/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func averageOfLevels(root *TreeNode) []float64 {
    ret := make([]float64, 0)
    q := make([]*TreeNode, 1)
    q[0] = root
    
    for len(q) > 0 {
        size := len(q)
        temp := 0
        
        for i := 0; i < size; i++ {
            temp += q[i].Val
            if q[i].Left != nil { q = append(q, q[i].Left) }
            if q[i].Right != nil { q = append(q, q[i].Right) }
        }
        
        ret = append(ret, float64(temp) / float64(size))
        q = q[size:]
    }
    
    return ret
}