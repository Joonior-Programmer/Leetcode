func distinctDifferenceArray(nums []int) []int {
    n := len(nums)
    count := make([]int, 51)
    checkPrefix := make([]bool, 51)

    prefix := 0
    elements := 0

    for i := 0; i < n; i++ { 
        if count[nums[i]] == 0 { elements++ }
        count[nums[i]]++
    }

    for i := 0; i < n; i++ {
        temp := nums[i]
        if !checkPrefix[temp] {
            prefix++
            checkPrefix[temp] = true
        }

        if count[temp] == 1 { elements-- }
        count[temp]--
        
        nums[i] = prefix - elements
    }

    return nums
}