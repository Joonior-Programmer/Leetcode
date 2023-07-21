func combinationSum3(k int, n int) [][]int {
    ret := make([][]int, 0)
    last := 10
    if n < last { last = n }
    
    dfs := func(curr []int, idx int, start int, currSum int){}
    dfs = func(curr []int, idx int, start int, currSum int){
        if idx == k {
            if currSum == n { ret = append(ret, curr) }
            return
        }
        
        for i := start; i < last; i++ {
            if currSum + i > n { return }
            curr[idx] = i
            dfs(append([]int(nil), curr...), idx + 1, i + 1, currSum + i)
        }
    }
    
    dfs(make([]int, k), 0, 1, 0)
    return ret
}