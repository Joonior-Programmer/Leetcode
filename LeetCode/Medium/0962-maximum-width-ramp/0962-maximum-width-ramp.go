func maxWidthRamp(nums []int) int {
    n := len(nums)
    ret := 0
    stack := []int{0}

    for i := 1; i < n; i++ {
        if nums[stack[len(stack)-1]] > nums[i] {
            stack = append(stack, i)
        }
    }

    i := len(stack)
    j := n - 1
    
    for i > 0 && j > -1 {
        for i > 0 && nums[stack[i-1]] <= nums[j] {
            i--
            ret = max(ret, j - stack[i])
        }
        j--
    }

    return ret
}


func max(a, b int) int {
    if a > b { return a }
    return b
}