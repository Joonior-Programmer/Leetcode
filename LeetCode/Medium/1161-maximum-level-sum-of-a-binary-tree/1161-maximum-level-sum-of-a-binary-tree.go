/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func maxLevelSum(root *TreeNode) int {
    sum := make([]int, 10001)
    maxLevel := 1
    DFS(root, 1, sum, &maxLevel)
    
    ret := 1
    maxSum := sum[1]
    
    for i := 2; i < maxLevel + 1; i++ {
        if sum[i] > maxSum {
            maxSum = sum[i]
            ret = i
        }
    }
    
    return ret
}

func DFS(node *TreeNode, level int, sum []int, maxLevel *int) {
    if node == nil { return }
    if *maxLevel < level { *maxLevel = level }
    sum[level] += node.Val
    DFS(node.Left, level + 1, sum, maxLevel)
    DFS(node.Right, level + 1, sum, maxLevel)
}