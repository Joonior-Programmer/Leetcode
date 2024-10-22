/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

type MinHeap []int64

func (h MinHeap) Len() int           { return len(h) }
func (h MinHeap) Less(i, j int) bool { return h[i] < h[j] }
func (h MinHeap) Swap(i, j int)      { h[i], h[j] = h[j], h[i] }

func (h *MinHeap) Push(x interface{}) {
	*h = append(*h, x.(int64))
}

func (h *MinHeap) Pop() interface{} {
	old := *h
	n := len(old)
	x := old[n-1]
	*h = old[0 : n-1]
	return x
}

func kthLargestLevelSum(root *TreeNode, k int) int64 {
    if root == nil {
		return -1
	}

	minHeap := &MinHeap{}
	heap.Init(minHeap)

	q := []*TreeNode{root}

	for len(q) > 0 {
		tempRet := int64(0)
		size := len(q)

		for i := 0; i < size; i++ {
			v := q[0]
			q = q[1:] // dequeue
            tempRet += int64(v.Val)

			if v.Left != nil {
				q = append(q, v.Left)
			}
			if v.Right != nil {
				q = append(q, v.Right)
			}
		}

		heap.Push(minHeap, tempRet)
		if minHeap.Len() > k {
			heap.Pop(minHeap) // Keep only the k smallest sums
		}
	}

	if minHeap.Len() < k {
		return -1
	}
	return (*minHeap)[0]
}