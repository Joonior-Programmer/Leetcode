func subsets(nums []int) [][]int {
    ret := make([][]int, 0)
    
    dfs := func(idx int, curr []int){}
    dfs = func(idx int, curr []int){
        if idx > len(nums) { return }
        
        ret = append(ret, append([]int{}, curr...))

        for i := idx; i < len(nums); i++ {
            curr = append(curr, nums[i])
            dfs(i + 1, curr)
            curr = curr[:len(curr)-1]
        }
    }
    
    dfs(0, make([]int, 0))
    
    return ret
}