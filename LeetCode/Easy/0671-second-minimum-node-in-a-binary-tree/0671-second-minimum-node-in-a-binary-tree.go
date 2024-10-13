/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func findSecondMinimumValue(root *TreeNode) int {
    exist := make(map[int]bool)
    first := math.MaxInt
    second := math.MaxInt

    dfs := func(node *TreeNode){}
    dfs = func(node *TreeNode) {
        if node == nil {
            return
        }

        if _, found := exist[node.Val]; !found {
            if node.Val < first {
                second = first
                first = node.Val
            } else if node.Val < second {
                second = node.Val
            }
            exist[node.Val] = true
        }

        dfs(node.Left)
        dfs(node.Right)
    }

    dfs(root)

    if len(exist) == 1 {
        return -1
    }

    return second
}