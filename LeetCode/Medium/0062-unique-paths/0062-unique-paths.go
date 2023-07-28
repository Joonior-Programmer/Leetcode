func uniquePaths(m int, n int) int {
    ret := make([]int, n)
    
    for i := 0; i < n; i++ { ret[i] = 1 }
    
    for j := 1; j < m; j++ {
        for i := 1; i < n; i++ { ret[i] += ret[i-1] }
    }
    
    return ret[n-1]
}