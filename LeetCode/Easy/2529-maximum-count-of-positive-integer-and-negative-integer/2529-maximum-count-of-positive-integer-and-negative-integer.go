func maximumCount(nums []int) int {
    pos := 0
    neg := 0

    for _, num := range nums {
        if num < 0 {
            neg++
        } else if num > 0 {
            pos++
        }
    }

    if pos > neg { return pos }
    return neg
}