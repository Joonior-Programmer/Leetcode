func numberOfPairs(nums1 []int, nums2 []int, k int) int {
    ret := 0

    for _, v0 := range nums1 {
        for _, v1 := range nums2 {
            if v0 % (v1 * k) == 0 {
                ret++
            }
        }
    }

    return ret
}