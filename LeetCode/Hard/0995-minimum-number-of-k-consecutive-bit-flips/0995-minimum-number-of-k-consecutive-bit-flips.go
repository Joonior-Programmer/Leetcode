func minKBitFlips(nums []int, k int) int {
    n := len(nums)
    ret := 0
    flippedTime := 0

    for i := 0; i < n; i++ {
        if i >= k && nums[i - k] == 2 { flippedTime-- }
        if flippedTime % 2 == nums[i]{
            if i + k > n { return -1 }

            ret++
            flippedTime++
            nums[i] = 2
        }
    }

    return ret
}