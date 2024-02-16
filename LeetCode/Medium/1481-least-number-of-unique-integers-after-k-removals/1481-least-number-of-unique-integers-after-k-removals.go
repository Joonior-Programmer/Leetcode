func findLeastNumOfUniqueInts(arr []int, k int) int {
    n := len(arr)
    counter := make(map[int]int)
    count := make([]int, n+1)
    ret := 0

    for i := 0; i < n; i++ {
        if _, ok := counter[arr[i]]; ok {
            counter[arr[i]]++
        } else { counter[arr[i]] = 1 }

    }

    for _, v := range counter {
        ret++
        count[v]++
    }

    i := 1

    for k > 0 {
        if count[i] > 0 {
            count[i]--
            ret--
            k -= i
        } else { i++ }
    }

    if k < 0 { return ret + 1 }
    return ret
}