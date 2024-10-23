/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func replaceValueInTree(root *TreeNode) *TreeNode {
    sum_level := []int{}
        
    add_dfs := func(node *TreeNode, depth int) {}
    add_dfs = func(node *TreeNode, depth int) {
        if node == nil { return }

        if len(sum_level) == depth {
            sum_level = append(sum_level, node.Val)
        } else { sum_level[depth] += node.Val }

        add_dfs(node.Left, depth + 1)
        add_dfs(node.Right, depth + 1)
    }

    dfs := func(node *TreeNode, level, children_sum int){}
    dfs = func(node *TreeNode, level, children_sum int){
        if node == nil { return }

        node.Val = sum_level[level] - children_sum

        next_sum := 0

        if node.Left != nil { next_sum += node.Left.Val }
        if node.Right != nil { next_sum += node.Right.Val }

        dfs(node.Left, level + 1, next_sum)
        dfs(node.Right, level + 1, next_sum)
    }

    add_dfs(root, 0)
    dfs(root, 0, root.Val)

    return root
}