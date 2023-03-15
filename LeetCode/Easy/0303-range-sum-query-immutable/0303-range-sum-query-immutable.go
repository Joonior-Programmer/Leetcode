type NumArray struct {
    sumArray []int
}


func Constructor(nums []int) NumArray {
    obj := NumArray{make([]int, len(nums))}
    obj.sumArray[0] = nums[0]
    for i := 1; i < len(nums); i++ {
        obj.sumArray[i] = obj.sumArray[i-1] + nums[i]
    }
    return obj

}


func (this *NumArray) SumRange(left int, right int) int {
    if left == 0 { return this.sumArray[right]}
    return this.sumArray[right] - this.sumArray[left - 1]
}


/**
 * Your NumArray object will be instantiated and called as such:
 * obj := Constructor(nums);
 * param_1 := obj.SumRange(left,right);
 */