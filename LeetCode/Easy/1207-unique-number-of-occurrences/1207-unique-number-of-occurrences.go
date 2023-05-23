func uniqueOccurrences(arr []int) bool {
    count := make([]int, 2000)
    ret := make([]int, 1001)
    
    for i := 0; i < len(arr); i++ { count[arr[i] + 1000]++ }
    
    for i := 0; i < 2000; i++ {
        if count[i] == 0 { continue }
        if ret[count[i]] != 0 { return false }
        ret[count[i]]++
    }
    
    return true
}