func numRollsToTarget(n int, k int, target int) int {
    memo := make([][]int, n+1)
    
    for i := 1; i < n+1; i++ { memo[i] = make([]int, target+1) }
    
    dfs := func(remain, left int) int { return 0 }
    dfs = func(remain, left int) int { 
        if left == 0 {
            if remain == 0 { return 1 }
            return 0
        }
        
        if remain > left || remain * k < left { return 0 }
        
        if memo[remain][left] != 0 { return memo[remain][left] }
        
        count := 0
        
        for i := 1; i < k + 1; i++ {
            count = (count + dfs(remain - 1, left - i)) % (1e9 + 7)
        }
        
        memo[remain][left] = count
        return count
    }
    
    return dfs(n, target)
}