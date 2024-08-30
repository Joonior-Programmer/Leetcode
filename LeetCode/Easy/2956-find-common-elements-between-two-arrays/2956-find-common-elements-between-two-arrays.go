func findIntersectionValues(nums1 []int, nums2 []int) []int {
    count1 := make([]int, 101)
    count2 := make([]int, 101)

    ret1 := 0
    ret2 := 0

    for _, v := range nums1 { count1[v]++ }
    for _, v := range nums2 { count2[v]++ }

    for i := 1; i < 101; i++ {
        if count2[i] > 0 { ret1 += count1[i] }
    }

    for i := 1; i < 101; i++ {
        if count1[i] > 0 { ret2 += count2[i] }
    }

    return []int{ret1, ret2}
}