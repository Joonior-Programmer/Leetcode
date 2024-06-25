func numberGame(nums []int) []int {
    count := make([]int, 101)
    i := 1
    idx := 0

    for _, v := range nums { count[v] += 1 }

    for i < 101 {
        for i < 101 && count[i] < 1 { i++ }

        if i > 100 { break }

        nums[idx+1] = i
        count[i] -= 1

        for i < 101 && count[i] < 1 { i++ }
        if i > 100 { break }
        nums[idx] = i
        count[i] -= 1

        idx += 2
    }

    return nums
}