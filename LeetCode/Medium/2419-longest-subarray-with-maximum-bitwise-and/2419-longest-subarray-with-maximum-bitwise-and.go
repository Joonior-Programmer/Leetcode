func longestSubarray(nums []int) int {
    ret := 1
    curr := 0
    target := 0

    for _, v := range nums {
        if target < v {
            ret = 1
            curr = 0
            target = v
        }

        if v == target {
            curr++
        } else {
            ret = max(ret, curr)
            curr = 0
        }
    }

    ret = max(ret, curr)

    return ret
}

func max(a, b int) int {
    if b > a { return b }
    return a
}