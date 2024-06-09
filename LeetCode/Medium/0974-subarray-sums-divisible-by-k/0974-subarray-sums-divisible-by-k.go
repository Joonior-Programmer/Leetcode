func subarraysDivByK(nums []int, k int) int {
    curr := 0
    ret := 0
    exist := make([]int, 10001)

    for _, v := range nums {
        curr = (curr + v) % k
        
        if curr < 0 { curr += k }
        if curr == 0 { ret++ }
        if exist[curr] > 0 { ret += exist[curr] } 

        exist[curr]++
    }

    return ret
}