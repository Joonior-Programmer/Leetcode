type MinHeap []int

func (h MinHeap) Len() int           { return len(h) }
func (h MinHeap) Less(i, j int) bool { return h[i] < h[j] }
func (h MinHeap) Swap(i, j int)      { h[i], h[j] = h[j], h[i] }

func (h *MinHeap) Push(x interface{}) {
    *h = append(*h, x.(int))
}

func (h *MinHeap) Pop() interface{} {
    old := *h
    n := len(old)
    x := old[n-1]
    *h = old[0 : n-1]
    return x
}

func (h *MinHeap) Peek() int {
    return (*h)[0]
}

type KthLargest struct {
    k   int
    hq  *MinHeap
}

func Constructor(k int, nums []int) KthLargest {
    hq := &MinHeap{}
    heap.Init(hq)
    kth := KthLargest{k: k, hq: hq}

    for _, v := range nums {
        kth.Add(v)
    }

    return kth
}

func (kth *KthLargest) Add(val int) int {
    if kth.hq.Len() < kth.k {
        heap.Push(kth.hq, val)
    } else if kth.hq.Peek() < val {
        heap.Pop(kth.hq)
        heap.Push(kth.hq, val)
    }

    return kth.hq.Peek()
}


/**
 * Your KthLargest object will be instantiated and called as such:
 * obj := Constructor(k, nums);
 * param_1 := obj.Add(val);
 */