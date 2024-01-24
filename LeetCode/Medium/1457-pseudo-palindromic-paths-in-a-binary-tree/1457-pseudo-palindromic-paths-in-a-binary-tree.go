/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func pseudoPalindromicPaths (root *TreeNode) int {
    dfs := func(node *TreeNode, count []int) int { return 0 }
    dfs = func(node *TreeNode, count []int) int {
        count[node.Val]++
        
        if (node.Left == nil && node.Right == nil){
            isOddExist := false
            
            for i := 1; i < 10; i++ {
                if count[i] % 2 == 1 {
                    if isOddExist {
                        count[node.Val]--
                        return 0
                    }
                    isOddExist = true
                }
            }

            count[node.Val]--
            
            return 1
        }
        
        ret := 0
        
        if node.Left != nil { ret += dfs(node.Left, count) }
        if node.Right != nil { ret += dfs(node.Right, count) }
        
        count[node.Val]--
        
        return ret
    }
    
    return dfs(root, make([]int, 10))
}