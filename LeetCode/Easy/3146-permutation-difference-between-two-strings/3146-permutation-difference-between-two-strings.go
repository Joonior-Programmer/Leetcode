func findPermutationDifference(s string, t string) int {
    ret := 0
    idxs := make([]int, 26)

    for i := 0; i < len(s); i++ { idxs[s[i]-'a'] = i }

    for i := 0; i < len(s); i++ { ret += abs(idxs[t[i]-'a'] - i) }

    return ret
}

func abs(a int) int {
    if a < 0 { return -a }
    return a
}