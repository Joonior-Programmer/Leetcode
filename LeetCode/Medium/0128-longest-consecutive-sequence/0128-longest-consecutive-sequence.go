func longestConsecutive(nums []int) int {
    numMap := make(map[int]bool)
    ret := 0
    
    for i := 0; i < len(nums); i++ { numMap[nums[i]] = true }
    
    for _, num := range nums {
        if _, ok := numMap[num-1]; !ok {
            curr := num + 1
            for true { 
                if _, ok := numMap[curr]; !ok { break }
                curr++ 
            }
            ret = max(ret, curr - num)
            if ret > len(nums) / 2 { break }
        }
    }
    
    return ret
}

func max (a, b int) int {
    if a > b { return a }
    return b
}