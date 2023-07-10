func findCircleNum(isConnected [][]int) int {
    n := len(isConnected)
    visited := make([]bool, n)
    ret := 0
    
    dfs := func(curr int){}
    dfs = func(curr int) {
        visited[curr] = true
        
        for i := 0; i < n; i++ {
            if isConnected[curr][i] == 1 && !visited[i] { dfs(i) }
        }
    }
    
    for i := 0; i < n; i++ {
        if !visited[i] {
            dfs(i)
            ret++
        }
    }
    
    return ret
}