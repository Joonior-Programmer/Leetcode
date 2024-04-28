func divideArray(nums []int) bool {
    count := make([]int, 501)
        
    for _, v := range nums { count[v]++ }

    for i := 1; i < 501; i++ {
        if count[i] % 2 == 1 { return false }
    }

    return true
}