func bagOfTokensScore(tokens []int, power int) int {
    sort.Ints(tokens)
    curr := 0
    ret := 0
    l := 0;
    r := len(tokens) - 1

    for l <= r {
        if tokens[l] <= power {
            curr++
            power -= tokens[l]
            l++
            ret = max(ret, curr)
        } else if ret > 0 {
            power += tokens[r]
            curr--
            r--
        } else { break }
    }

    return ret
}