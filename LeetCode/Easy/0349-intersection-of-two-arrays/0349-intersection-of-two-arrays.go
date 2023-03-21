func intersection(nums1 []int, nums2 []int) []int {
    ret := make([]int, 0)
    a := make(map[int]bool)
    b := make(map[int]bool)
    
    for i := 0; i < len(nums1); i++ {a[nums1[i]] = true}
    for i := 0; i < len(nums2); i++ {b[nums2[i]] = true}

    for k , _ := range a {
        if b[k] { ret = append(ret, k) }
    }
    
    return ret
}