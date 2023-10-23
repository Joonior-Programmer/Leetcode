type Triple struct {
    sum, i, j int
}

type MinHeap []Triple

func (h MinHeap) Len() int           { return len(h) }
func (h MinHeap) Less(i, j int) bool { return h[i].sum < h[j].sum }
func (h MinHeap) Swap(i, j int)      { h[i], h[j] = h[j], h[i] }

func (h *MinHeap) Push(x interface{}) {
    *h = append(*h, x.(Triple))
}

func (h *MinHeap) Pop() interface{} {
    old := *h
    n := len(old)
    x := old[n-1]
    *h = old[0 : n-1]
    return x
}

func kSmallestPairs(nums1 []int, nums2 []int, k int) [][]int {
    h := &MinHeap{}
    heap.Init(h)

    for i := 0; i < k && i < len(nums1); i++ {
        heap.Push(h, Triple{nums1[i] + nums2[0], i, 0})
    }

    ret := make([][]int, 0)

    for k > 0 && h.Len() > 0 {
        target := heap.Pop(h).(Triple)
        i, j := target.i, target.j

        ret = append(ret, []int{nums1[i], nums2[j]})

        if j+1 < len(nums2) {
            heap.Push(h, Triple{nums1[i] + nums2[j+1], i, j+1})
        }

        k--
    }

    return ret
}