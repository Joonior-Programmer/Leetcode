func intersection(nums1 []int, nums2 []int) []int {
    ret := make([]int, 0)
    a := make(map[int]bool)
    
    for i := 0; i < len(nums1); i++ {a[nums1[i]] = true}


    for _ , v := range nums2 {
        if a[v] { 
            ret = append(ret, v) 
            a[v] = false
        }
    }
    
    return ret
}