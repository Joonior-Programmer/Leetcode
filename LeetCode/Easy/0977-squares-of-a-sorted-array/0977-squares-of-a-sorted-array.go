func sortedSquares(nums []int) []int {
    count := make([]int, 20001)
    j := 0

    for i := 0; i < len(nums); i++ { count[nums[i] + 10000]++ }

    for count[10000] > 0 {
        count[10000]--
        nums[j] = 0
        j++
    }

    for i := 1; i < 10001; i++ {
        for count[10000+i] > 0 {
            count[10000+i]--
            nums[j] = i * i
            j++
        }

        for count[10000-i] > 0 {
            count[10000-i]--
            nums[j] = i * i
            j++
        }    
    }

    return nums
}