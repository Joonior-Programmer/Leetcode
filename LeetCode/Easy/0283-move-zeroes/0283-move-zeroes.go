func moveZeroes(nums []int)  {
    idx := 0
    numOfZero := 0
    for i := 0; i < len(nums); i++ {
        if nums[i] == 0 {
            numOfZero++
        } else {
            nums[idx] = nums[i]
            idx++
        }
    }
    for i := len(nums) - numOfZero; i < len(nums); i++{
        nums[i] = 0
    }
}