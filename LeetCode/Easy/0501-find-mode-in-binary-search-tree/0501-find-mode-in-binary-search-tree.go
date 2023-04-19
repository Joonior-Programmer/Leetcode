/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func findMode(root *TreeNode) []int {
    count := make(map[int]int)
    ret := make([]int, 0)
    max_val := 0
    dfs(root, count)
    
    for k, v := range count {
        if v > max_val {
            ret = make([]int, 1)
            max_val = v
            ret[0] = k
        } else if v == max_val {
            ret = append(ret, k)
        }
    }
    
    return ret
}

func dfs(node *TreeNode, count map[int]int) {
    if node == nil {return}
    _, ok := count[node.Val]
    if ok {
        count[node.Val]++
    } else {
        count[node.Val] = 1
    }
    dfs(node.Left, count)
    dfs(node.Right, count)
}