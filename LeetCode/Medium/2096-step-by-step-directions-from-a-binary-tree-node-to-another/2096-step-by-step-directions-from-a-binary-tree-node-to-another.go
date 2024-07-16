/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func getDirections(root *TreeNode, startValue int, destValue int) string {
    var lca func(*TreeNode) *TreeNode
	var search func(*TreeNode, int, *[]byte) bool

	// Function to find the lowest common ancestor (LCA)
	lca = func(node *TreeNode) *TreeNode {
		if node == nil {
			return nil
		}
		if node.Val == startValue || node.Val == destValue {
			return node
		}
		left := lca(node.Left)
		right := lca(node.Right)
		if left != nil && right != nil {
			return node
		}
		if left != nil {
			return left
		}
		return right
	}

	// Function to search for the path to a given value
	search = func(node *TreeNode, v int, path *[]byte) bool {
		if node == nil {
			return false
		}
		if node.Val == v {
			return true
		}
		*path = append(*path, 'L')
		if search(node.Left, v, path) {
			return true
		}
		*path = (*path)[:len(*path)-1]

		*path = append(*path, 'R')
		if search(node.Right, v, path) {
			return true
		}
		*path = (*path)[:len(*path)-1]

		return false
	}

	lcaNode := lca(root)
	var s, d []byte
	search(lcaNode, startValue, &s)
	search(lcaNode, destValue, &d)

	return strings.Repeat("U", len(s)) + string(d)
}