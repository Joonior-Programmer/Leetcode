func findLucky(arr []int) int {
    n := len(arr)
    count := make([]int, 501)
    
    for i := 0; i < n; i++ { count[arr[i]]++ }
    
    for i := n; i > 0; i-- {
        if count[i] == i { return i }
    }
    
    return -1
}