func climbStairs(n int) int {
    pib := make([]int, max(2, n))
    pib[0] = 1
    pib[1] = 2
    
    for i := 2; i < n; i++ { pib[i] = pib[i-1] + pib[i-2] }
    
    return pib[n-1]
}

func max(a, b int) int {
    if a > b { return a }
    return b
}