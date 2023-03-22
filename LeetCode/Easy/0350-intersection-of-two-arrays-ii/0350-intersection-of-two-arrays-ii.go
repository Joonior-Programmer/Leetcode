func intersect(nums1 []int, nums2 []int) []int {
    sort.Ints(nums1)
    sort.Ints(nums2)
    i := len(nums1) - 1
    j := len(nums2) - 1
    ret := make([]int, 0)
    for i > -1 && j > -1 {
        if nums1[i] == nums2[j]{
            ret = append(ret, nums1[i])
            i--
            j--
        } else if nums1[i] > nums2[j] {
            i--
        } else { j-- }
    }
    return ret
}