func getMinDistance(nums []int, target int, start int) int {
    ret := 10001;
        
    for i := 0; i < len(nums); i++ {
        if nums[i] == target { ret = min(ret, abs(i - start)) }
    }

    return ret
}


func min(a, b int) int {
    if a < b { return a }
    return b
}


func abs(a int) int {
    if a < 0 { return -a }
    return a
}