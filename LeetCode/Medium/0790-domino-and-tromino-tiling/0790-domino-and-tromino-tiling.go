func numTilings(n int) int {
    size := 3
    if n > 3 { size = n }
    ret := make([]int64, size)
    
    ret[0] = 1
    ret[1] = 2
    ret[2] = 5
    
    for i := 3; i < n; i++ {
        ret[i] = (ret[i-1] * 2 + ret[i-3]) % 1000000007
    }
    
    return int(ret[n-1])
}