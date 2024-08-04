func rangeSum(nums []int, n int, left int, right int) int {
    newArr := make([]int, n * (n + 1) / 2)
    idx := 0
    ret := 0

    for i := 0; i < n; i++ {
        curr := 0
        for j := i; j < n; j++ {
            curr += nums[j]
            newArr[idx] = curr
            idx++
        }
    }

    sort.Ints(newArr)

    for i := left - 1; i < right; i++ { ret = (ret + newArr[i]) % 1000000007 }

    return ret
}