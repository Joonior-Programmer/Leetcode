func leftRightDifference(nums []int) []int {
    n := len(nums)
    l_sum := make([]int, n)
    r_sum := make([]int, n)

    for i := 1; i < n; i++ {
        l_sum[i] = l_sum[i-1] + nums[i-1]
    }

    for i := n-2; i > -1; i-- {
        r_sum[i] = r_sum[i+1] + nums[i+1]
    }
    
    for i := 0; i < n; i++ { l_sum[i] = abs(l_sum[i] - r_sum[i]) }

    return l_sum
}


func abs(a int) int {
    if a < 0 { return -a }
    return a
}