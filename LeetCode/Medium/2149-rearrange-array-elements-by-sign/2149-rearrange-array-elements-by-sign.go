func rearrangeArray(nums []int) []int {
    n := len(nums)
    i := 0
    j := 1
    ret := make([]int, n)

    for idx := 0; idx < n; idx++ {
        if nums[idx] > 0 {
            ret[i] = nums[idx];
            i += 2;
        } else {
            ret[j] = nums[idx];
            j += 2;
        }   
    }

    return ret;
}