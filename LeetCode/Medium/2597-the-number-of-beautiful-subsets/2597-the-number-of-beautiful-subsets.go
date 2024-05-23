func beautifulSubsets(nums []int, k int) int {
    n := len(nums)
    ret := 0
    count := make([]int, 1001)
    
    dfs := func(idx int){}
    dfs = func(idx int){
        if idx == n { return }

        temp := nums[idx]
        
        if (temp - k < 0 || count[temp - k] == 0) && 
        (temp + k > 1000 || count[temp + k] == 0) {
            ret++
            count[nums[idx]]++

            dfs(idx + 1)
            count[temp]--
            dfs(idx + 1)
        } else { dfs(idx + 1) }
    }

    dfs(0)

    return ret
}