func pivotIndex(nums []int) int {
    left := make([]int, len(nums) + 1)
    right := make([]int, len(nums) + 1)
    var temp int

    for i := len(nums) - 1; i > 0; i-- {
        right[i] = right[i+1] + nums[i]
    }

    for i := 0; i < len(nums); i++ {
        if i != 0 {
            temp = left[i-1] + nums[i-1]
            if temp == right[i+1] { return i}
            left[i] = temp
        } else {
            if right[1] == 0 {return 0}
        }
        
    }

    return -1
}