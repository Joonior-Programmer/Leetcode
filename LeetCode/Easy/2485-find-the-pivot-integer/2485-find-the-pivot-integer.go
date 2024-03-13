func pivotInteger(n int) int {
    ret := 1
    curr := 1
    curr_n := (n * (n + 1)) / 2

    for curr <= curr_n {
        if curr == curr_n { return ret }
        curr_n -= ret
        ret++
        curr += ret
    }

    return -1
}