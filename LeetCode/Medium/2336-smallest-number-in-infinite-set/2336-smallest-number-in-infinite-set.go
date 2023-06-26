type SmallestInfiniteSet struct {
    heap []bool
    curr int
}


func Constructor() SmallestInfiniteSet {
    return SmallestInfiniteSet{make([]bool, 1001), 1}
}


func (this *SmallestInfiniteSet) PopSmallest() int {
    ret := 0
    for i := this.curr; i < 1001; i++ {
        if !this.heap[i] {
            this.heap[i] = true
            ret = i
            break
        }
    }
    this.curr = ret + 1
    return ret
}


func (this *SmallestInfiniteSet) AddBack(num int)  {
    if this.heap[num] {
        if num < this.curr { this.curr = num }
        this.heap[num] = false
    }
}


/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.PopSmallest();
 * obj.AddBack(num);
 */