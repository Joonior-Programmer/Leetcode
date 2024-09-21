func lexicalOrder(n int) []int {
    ret := make([]int, n)
    
    i := 0
    
    dfs := func(curr int) {}
    dfs = func(curr int) {
        if curr > n { return }
        
        ret[i] = curr
        i++
        
        dfs(curr * 10)
        if curr % 10 != 9 { dfs(curr + 1) }
    }
    
    dfs(1)
    
    return ret
}