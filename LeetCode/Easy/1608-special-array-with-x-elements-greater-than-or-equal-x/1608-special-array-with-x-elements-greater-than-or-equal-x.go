func specialArray(nums []int) int {
    count := make([]int, 1001)
        
    for _, num := range nums { count[num]++ }

    for i := 999; i > -1; i-- {
        count[i] += count[i+1]

        if count[i] == i { return i }
    }

    return -1
}