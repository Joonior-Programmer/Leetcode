func combinationSum(candidates []int, target int) [][]int {
    ret := make([][]int, 0)
    
    dfs := func(curr []int, idx int, sum int){}
    dfs = func(curr []int, idx int, sum int){
        if sum == target {
            ret = append(ret, append([]int(nil), curr...))
            return
        }
        
        if idx >= len(candidates) || target < sum { return }
        
        curr = append(curr, candidates[idx])
        dfs(curr, idx, sum + candidates[idx])
        curr = curr[:len(curr)-1]
        dfs(curr, idx+1, sum)
    }
    
    dfs(make([]int, 0), 0, 0)
    
    return ret
}