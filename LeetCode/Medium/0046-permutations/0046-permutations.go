func permute(nums []int) [][]int {
    ret := make([][]int, 0)
    
    if len(nums) == 1 { return append(ret, nums[:]) }
    
    for i := 0; i < len(nums); i++ {
        nextNums := append([]int(nil), nums[:i]...)
        nextNums = append(nextNums, nums[i+1:]...)
        perms := permute(nextNums)

        for _, perm := range perms {
            perm = append(perm, nums[i])
            ret = append(ret, perm[:])
        }
    }

    return ret
}