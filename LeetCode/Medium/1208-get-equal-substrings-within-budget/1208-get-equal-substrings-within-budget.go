func equalSubstring(s string, t string, maxCost int) int {
    n := len(s)
    diff := make([]int, n)
    ret := 0
    l, curr := 0, 0

    for i := 0; i < n; i++ { diff[i] = abs(int(s[i]) - int(t[i])) }

    for r := 0; r < n; r++ {
        curr += diff[r]


        if curr > maxCost {
            curr -= diff[l]
            l++
        }

        ret = max(ret, r - l + 1)
    }

    return ret
}

func abs(a int) int {
    if a < 0 { return -a }
    return a
}

func max(a, b int) int {
    if a > b { return a }
    return b
}