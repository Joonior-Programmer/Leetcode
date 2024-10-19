func findKthBit(n int, k int) byte {
    
    dfs := func(n, k int) byte { return '0' }
    dfs = func(n, k int) byte {
        if n == 1 { return '0' }
        
        length := int(math.Pow(float64(2), float64(n))) - 1
        mid := int(math.Pow(float64(2), float64(n-1)))
        
        if k == mid {
            return '1'
        } else if k < mid {
            return dfs(n-1, k)
        } else { 
            if dfs(n-1, length - k + 1) == '1' { return '0' }
            return '1'
        }
    }
    
    return dfs(n, k)
}