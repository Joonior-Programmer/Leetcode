func minOperations(nums []int, k int) int {
    curr := nums[0]
    ret := 0

    for i := 1; i < len(nums); i++ {
        curr ^= nums[i]
    }

    for curr > 0 || k > 0 {
        if curr % 2 != k % 2 { ret++ }
        curr >>= 1
        k >>= 1
    }

    return ret
}