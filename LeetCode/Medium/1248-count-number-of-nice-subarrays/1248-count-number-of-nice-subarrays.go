func numberOfSubarrays(nums []int, k int) int {
    n := len(nums)
    count := make([]int, n+1)
    count[0]++
    curr := 0
    ret := 0

    for _, v := range nums {
        if v % 2 == 1 { curr++ }
        if curr >= k { ret += count[curr-k] }
        count[curr]++
    }

    return ret
}