/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func countPairs(root *TreeNode, distance int) int {
    ret := 0
        
    dfs := func(node *TreeNode) []int { return []int{} }
    dfs = func(node *TreeNode) []int { 
        if node == nil { return []int{} }
            
        l := dfs(node.Left)
        r := dfs(node.Right)

        n := len(l)
        m := len(r)
        
        if n + m == 0 { return []int{1} }

        for _, v0 := range l {
            if v0 >= distance { continue }

            for _, v1 := range r {
                if v0 + v1 <= distance { ret++ }
            }
        }
        
        returnVal := make([]int, n+m)
        i := 0
        
        for j := 0; j < n; j++ {
            returnVal[i] = l[j] + 1
            i++
        }
        
        for j := 0; j < m; j++ {
            returnVal[i] = r[j] + 1
            i++
        }
        
        return returnVal
    }

    dfs(root)

    return ret
}