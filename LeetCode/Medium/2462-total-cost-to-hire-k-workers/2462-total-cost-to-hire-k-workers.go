type PriorityQueue []int

func (pq PriorityQueue) Len() int            { return len(pq) }
func (pq PriorityQueue) Less(i, j int) bool  { return pq[i] < pq[j] }
func (pq PriorityQueue) Swap(i, j int)       { pq[i], pq[j] = pq[j], pq[i] }
func (pq *PriorityQueue) Push(x interface{}) { *pq = append(*pq, x.(int)) }
func (pq *PriorityQueue) Pop() interface{} {
	old := *pq
	n := len(old)
	x := old[n-1]
	*pq = old[0 : n-1]
	return x
}

func totalCost(costs []int, k int, candidates int) int64 {
	ret := int64(0)
	n := len(costs)

	if n <= candidates*2 {
		sort.Ints(costs)
		for i := 0; i < k; i++ {
			ret += int64(costs[i])
		}
		return ret
	}

	lPQ := make(PriorityQueue, 0)
	rPQ := make(PriorityQueue, 0)
	heap.Init(&lPQ)
	heap.Init(&rPQ)
	l := candidates
	r := n - candidates

	for i := 0; i < l; i++ {
		heap.Push(&lPQ, costs[i])
	}
	for i := r; i < n; i++ {
		heap.Push(&rPQ, costs[i])
	}

	for k > 0 {
		lVal := lPQ[0]
		rVal := rPQ[0]

		if rVal < lVal {
			ret += int64(rVal)
			heap.Pop(&rPQ)
			heap.Push(&rPQ, costs[r-1])
			r--
		} else {
			ret += int64(lVal)
			heap.Pop(&lPQ)
			heap.Push(&lPQ, costs[l])
			l++
		}
		k--

		if l >= r {
			for len(rPQ) > 0 {
				heap.Push(&lPQ, heap.Pop(&rPQ))
			}
			for k > 0 {
				ret += int64(lPQ[0])
				heap.Pop(&lPQ)
				k--
			}
		}
	}
	return ret
}
