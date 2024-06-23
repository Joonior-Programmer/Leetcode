func minimumAverage(nums []int) float64 {
    count := make([]int, 51)
    var ret float64 = 9999
    
    for i := 0; i < len(nums); i++ { count[nums[i]]++ }
    
    l, r := 1, 50
    
    for l <= r {
        for l <= r && count[l] < 1 { l++ }
        for l <= r && count[r] < 1 { r-- }

        if l > r { break }
        
        ret = min(ret, float64((l + r)) / 2)
        count[l]--
        count[r]--
    }
    
    return ret
}

func min(a, b float64) float64 {
    if a < b { return a }
    return b
}