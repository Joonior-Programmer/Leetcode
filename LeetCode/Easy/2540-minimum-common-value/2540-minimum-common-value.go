func getCommon(nums1 []int, nums2 []int) int {
    l1 := 0
    l2 := 0
    n := len(nums1)
    m := len(nums2)

    if nums1[n-1] < nums2[0] || nums2[m-1] < nums1[0] { return -1 }

    for l1 < n && l2 < m {
        temp1 := nums1[l1]
        temp2 := nums2[l2]

        if temp1 == temp2 {
            return temp1
        } else if temp1 < temp2 { 
            l1++ 
        }  else { l2++ }
    }

    return -1
}