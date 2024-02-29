/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func isEvenOddTree(root *TreeNode) bool {
    if root == nil || root.Val%2 == 0 {
		return false
	}

	queue := []*TreeNode{root}
	isOdd := true

	for len(queue) > 0 {
		size := len(queue)
		prev := 0
		if isOdd {
			prev = -1 << 31
		} else {
			prev = 1<<31 - 1
		}

		for i := 0; i < size; i++ {
			curr := queue[i]

			if (isOdd && (curr.Val%2 == 0 || curr.Val <= prev)) ||
				(!isOdd && (curr.Val%2 != 0 || curr.Val >= prev)) {
				return false
			}

			if curr.Left != nil {
				queue = append(queue, curr.Left)
			}
			if curr.Right != nil {
				queue = append(queue, curr.Right)
			}

			prev = curr.Val
		}

		queue = queue[size:]
		isOdd = !isOdd
	}

	return true
}