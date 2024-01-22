func findErrorNums(nums []int) []int {
    count := make([]int, len(nums)+1)
    ret := make([]int, 2)

    for i := 0; i < len(nums); i++ { count[nums[i]]++ }

    for i := 1; i < len(count); i++ {
        if count[i] == 0 {
            ret[1] = i  
        } else if count[i] == 2 { ret[0] = i }
    }

    return ret
}