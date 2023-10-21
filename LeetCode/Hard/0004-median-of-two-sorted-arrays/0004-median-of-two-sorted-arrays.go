func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
    n, m := len(nums1), len(nums2)
        
    if n == 0 {
        if m % 2 == 0 { return float64(nums2[m/2] + nums2[m/2-1]) / 2 }
        return float64(nums2[m / 2])
    }

    if m == 0 {
        if n % 2 == 0 { return float64(nums1[n/2] + nums1[n/2-1]) / 2 }
        return float64(nums1[n / 2])
    }

    totalLen := n + m
    i, j, k := 0, 0, 0
    merged := make([]int, totalLen)

    for i < n && j < m {
        if nums1[i] < nums2[j] { 
            merged[k] = nums1[i]
            k++
            i++
        } else { 
            merged[k] = nums2[j]
            k++
            j++
        }
    }

    for i < n {
        merged[k] = nums1[i]
        k++
        i++
    }
    for j < m {
        merged[k] = nums2[j]
        k++
        j++
    }

    if totalLen % 2 == 0 { return float64(merged[totalLen / 2] + merged[totalLen / 2 - 1]) / 2 }
    return float64(merged[totalLen / 2])
}