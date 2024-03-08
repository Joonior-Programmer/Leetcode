func maxFrequencyElements(nums []int) int {
    count := make([]int, 101)
    max := 0
    ret := 0

    for i := 0; i < len(nums); i++ { count[nums[i]]++ }

    for i := 1; i < 101; i++ {
        if count[i] > max {
            max = count[i]
            ret = max
        } else if count[i] == max {
            ret += max
        }
    }

    return ret
}