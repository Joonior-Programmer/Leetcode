func findMaxConsecutiveOnes(nums []int) int {
    ret := 0
    temp := 0
    for i := 0; i < len(nums); i++ {
        if nums[i] == 1 {
            temp++
            if temp > ret {ret = temp}
        } else {
            temp = 0
        }
    }
    return ret
}