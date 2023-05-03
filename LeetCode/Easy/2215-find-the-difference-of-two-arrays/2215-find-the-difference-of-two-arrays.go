func findDifference(nums1 []int, nums2 []int) [][]int {
    isExist1 := make(map[int]bool)
    isExist2 := make(map[int]bool)
    
    for i := 0; i < len(nums1); i++ {isExist1[nums1[i]] = true}
    for i := 0; i < len(nums2); i++ {isExist2[nums2[i]] = true}
    
    ret := make([][]int, 2)
    
    for num, _ := range isExist1 {
        _, ok := isExist2[num]
        if !ok {ret[0] = append(ret[0], num)}
    }
    
    for num, _ := range isExist2 {
        _, ok := isExist1[num]
        if !ok {ret[1] = append(ret[1], num)}
    }
    
    return ret
}