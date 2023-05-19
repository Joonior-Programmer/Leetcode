func findMaxAverage(nums []int, k int) float64 {
    sum := 0
    for i := 0; i < k; i++ { sum += nums[i]}

    ret := sum
    for i := 0; i < len(nums)-k; i++ {
        sum += nums[i+k] - nums[i]
        if sum > ret { ret = sum }
    }
    
    return float64(ret) / float64(k)
}