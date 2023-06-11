/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func longestZigZag(root *TreeNode) int {
    var ret int = 0
    DFS(root, true, 0, &ret)
    DFS(root, false, 0, &ret)
    return ret - 1
}

func DFS(node *TreeNode, is_left bool, depth int, ret *int) {
    if node == nil {
        if *ret < depth {
            *ret = depth
        }
        return
    }
    if is_left {
        DFS(node.Left, false, depth+1, ret)
        DFS(node.Right, false, 0, ret)
    } else {
        DFS(node.Right, true, depth+1, ret)
        DFS(node.Left, true, 0, ret)
    }
}