func minimumOperations(nums []int) int {
    ret := 0
        
    for _, v := range nums {
        if v % 3 != 0 { ret++ }
    }

    return ret
}