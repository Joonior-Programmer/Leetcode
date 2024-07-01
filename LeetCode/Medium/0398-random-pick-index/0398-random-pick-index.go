type Solution struct {
    nums []int
}


func Constructor(nums []int) Solution {
    return Solution{nums}
}


func (this *Solution) Pick(target int) int {
    idx := rand.Intn(len(this.nums))
    
    for this.nums[idx] != target { idx = rand.Intn(len(this.nums)) }
    
    return idx
}


/**
 * Your Solution object will be instantiated and called as such:
 * obj := Constructor(nums);
 * param_1 := obj.Pick(target);
 */