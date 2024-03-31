func sumOfUnique(nums []int) int {
    count := make([]int, 101)
    ret := 0
    for _, v := range nums { count[v]++ }
    
    for i := 1; i < 101; i++ {
        if count[i] == 1 { ret += i }
    }
    
    return ret
}