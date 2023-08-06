func removeDuplicates(nums []int) int {
    i := 0
    count := 0
    
    for j := 1; j < len(nums); j++ {
        if nums[i] == nums[j] {
            if count < 1 { 
                i++
                nums[i] = nums[j]
            }
            count++
        } else {
            count = 0
            i++
            nums[i] = nums[j]
        }
    }
    
    return i + 1
}