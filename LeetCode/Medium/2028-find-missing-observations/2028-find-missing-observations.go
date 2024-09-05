func missingRolls(rolls []int, mean int, n int) []int {
    m := len(rolls)
    sumCurr := 0

    for i := 0; i < m; i++ { sumCurr += rolls[i] }

    need := (n + m) * mean - sumCurr
    average := float32(need) / float32(n)

    if average > 6 || average < 1 { return []int{} }

    avg := int(average)
    ret := make([]int, n)
    idx := 0

    for n > 0 {
        ret[idx] = avg
        idx++
        need -= avg
        n--
    }

    for i := 0; i < need; i++ { ret[i]++ }

    return ret
}