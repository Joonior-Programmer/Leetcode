type IntHeap []int

func (h IntHeap) Len() int {
	return len(h)
}

func (h IntHeap) Less(i, j int) bool {
	return h[i] < h[j]
}

func (h IntHeap) Swap(i, j int) {
	h[i], h[j] = h[j], h[i]
}

func (h *IntHeap) Push(element interface{}) {
	*h = append(*h, element.(int))
}

func (h *IntHeap) Pop() interface{} {
	old := *h
	n := len(old)
	element := old[n-1]
	*h = old[0 : n-1]
	return element
}

func max(a, b int64) int64 {
	if a > b {
		return a
	}
	return b
}

func maxScore(nums1 []int, nums2 []int, k int) int64 {
	n := len(nums2)
	idxs := make([]int, n)

	for i := 0; i < n; i++ {
		idxs[i] = i
	}

	sort.Slice(idxs, func(i, j int) bool {
		return nums2[idxs[i]] > nums2[idxs[j]]
	})

	var n1Sum int64
	pq := &IntHeap{}
	
	for i := 0; i < k; i++ {
		n1Sum += int64(nums1[idxs[i]])
		heap.Push(pq, nums1[idxs[i]])
	}

	ret := n1Sum * int64(nums2[idxs[k-1]])

	for i := k; i < n; i++ {
		n1Sum += int64(nums1[idxs[i]]) - int64(heap.Pop(pq).(int))
		ret = max(ret, n1Sum*int64(nums2[idxs[i]]))
		heap.Push(pq, nums1[idxs[i]])
	}

	return ret
}