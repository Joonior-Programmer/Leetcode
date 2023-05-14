func findLHS(nums []int) int {
    // ret := 0
    // sort.Ints(nums)
    // prev := nums[0]
    // prevCount := 0
    // curCount := 1
    // for i := 1; i < len(nums); i++ {
    //     if nums[i] != nums[i-1] {
    //         prev = nums[i-1]
    //         prevCount = curCount
    //         curCount = 0
    //     }
        
    //     curCount++
        
    //     if nums[i] - 1 == prev {
    //         prevCount++
    //         if prevCount > ret { ret = prevCount }
    //     }
    // }
    // return ret

    ret := 0
    count := map[int]int{}

    for i := 0; i < len(nums); i++ {
        count[nums[i]]++
    }

    for k, v := range count {
        if count[k+1] != 0 {
            if v + count[k+1] > ret { ret = v + count[k+1]}
        }
    }

    return ret
}