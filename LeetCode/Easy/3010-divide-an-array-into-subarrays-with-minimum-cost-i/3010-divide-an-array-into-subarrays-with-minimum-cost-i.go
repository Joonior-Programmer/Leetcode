func minimumCost(nums []int) int {
    ret := nums[0]
    left := 2
    count := make([]int, 51)

    for i := 1; i < len(nums); i++ { count[nums[i]]++ }

    i := 1

    for left > 0 {
        if count[i] > 0 {
            count[i]--
            ret += i
            left--
        } else { i++ }
    }

    return ret
}