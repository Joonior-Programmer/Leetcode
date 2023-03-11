func moveZeroes(nums []int)  {
    j := 0
    for i := 0; i < len(nums); i++ {
        if nums[i] == 0 { continue }
        nums[i], nums[j] = nums[j], nums[i]
        j++
    }
}