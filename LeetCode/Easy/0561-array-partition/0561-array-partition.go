func arrayPairSum(nums []int) int {
    temp := make([]int, 20001)
    idx := 0

    for i := 0; i < len(nums); i++ { temp[nums[i] + 10000]++ }

    for i := 0; i < 20001; i++ {
        for j := 0; j < temp[i]; j++ { 
            nums[idx] = i - 10000 
            idx++
        }
    }

    ret := 0
    for i := 0; i < len(nums); i = i + 2 { ret += nums[i] }
    return ret
}