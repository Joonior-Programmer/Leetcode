func nextGreaterElement(nums1 []int, nums2 []int) []int {
    var findBig [10000]int = [10000]int{0}
    ret := make([]int, len(nums1))
    stack := make([]int, 0)
    
    for _, v := range nums2 {
        for len(stack) != 0 && stack[len(stack)-1] < v {
            key := stack[len(stack)-1]
            findBig[key] = v
            stack = stack[:len(stack)-1]
        }
        stack = append(stack, v)
    }
    
    for i := 0; i < len(nums1); i++ {
        if findBig[nums1[i]] == 0 {
            ret[i] = -1
        } else {
            ret[i] = findBig[nums1[i]]
        }
    }
    
    return ret
}