func sortArray(nums []int) []int {
    count := make([]int, 100001)
    idx := 0
    for _, v := range nums { count[v+50000]++ } 

    for i := 0; i < 100001; i++ {
        for j := 0; j < count[i]; j++ { 
            nums[idx] = i - 50000 
            idx++
        }
    }
    
    return nums
}