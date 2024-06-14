func minIncrementForUnique(nums []int) int {
    ret := 0
    count := make([]int, 100001)
    
    for _, v := range nums { count[v] += 1 }

    for i := 0; i < 100000; i++ {
        if count[i] > 1 {
            temp := count[i] - 1
            ret += temp
            count[i+1] += temp
        }
    }
    
    if count[100000] > 1 {
        temp := count[100000] - 1
        ret += temp * (temp + 1) / 2
    }

    return ret
}