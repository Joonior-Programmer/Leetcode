func decompressRLElist(nums []int) []int {
    ret := make([]int, 0)
    
    for i := 0; i < len(nums); i = i+2 {
        temp := nums[i+1]
        for j := 0; j < nums[i]; j++ { ret = append(ret, temp) }
    }
    
    return ret
}