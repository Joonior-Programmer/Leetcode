func divideArray(nums []int, k int) [][]int {
    ret := make([][]int, len(nums) / 3)
    sort.Ints(nums)

    for i := 0; i < len(nums); i += 3 {
        if nums[i+2] - nums[i] > k { return nil }

        ret[i/3] = []int{nums[i], nums[i+1], nums[i+2]}
    }

    return ret
}