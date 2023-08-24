func minSubArrayLen(target int, nums []int) int {
    l := 0
    r := 0
    n := len(nums)
    temp := nums[0]
    ret := 100001
    
    for r < n {
        if temp >= target {
            ret = min(ret, r - l + 1)
            temp -= nums[l]
            l++
        } else {
            r++
            if r < n { temp += nums[r] }
        }
    }
    
    if ret == 100001 { return 0 }
    
    return ret
}

func min(a, b int) int {
    if a < b { return a }
    return b
}