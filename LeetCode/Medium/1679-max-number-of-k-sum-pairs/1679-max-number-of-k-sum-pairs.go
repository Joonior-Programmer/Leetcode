func maxOperations(nums []int, k int) int {
    sort.Ints(nums)
    ret, i, j := 0, 0, len(nums) - 1
    var temp int
    
    for i < j {
        temp = nums[i] + nums[j]
        if temp == k {
            ret++
            i++
            j--
        } else if temp < k {
            i++
        } else { j-- }
    }
    
    return ret
}