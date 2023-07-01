/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func pathSum(root *TreeNode, targetSum int) int {
    lookup := make(map[int64]int)
    lookup[0] = 1
    return dfs(root, targetSum, 0, lookup)
}

func dfs(node *TreeNode, targetSum int, currSum int64, lookup map[int64]int) int {
    count := 0
    
    if (node != nil){
        currSum += int64(node.Val)
        diff := currSum - int64(targetSum)
        if val, ok := lookup[diff]; ok {
            count = val
        }
        lookup[int64(currSum)]++
        count += dfs(node.Left, targetSum, currSum, lookup) + dfs(node.Right, targetSum, currSum, lookup)
        lookup[int64(currSum)]--
    }
    
    return count
}