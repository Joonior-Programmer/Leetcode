func differenceOfSum(nums []int) int {
    a1 := 0
    a2 := 0
    
    for _, v := range nums {
        a1 += v
        for v > 0 {
            a2 += v % 10
            v /= 10
        }
    }
    
    return a1 - a2
}