func totalMoney(n int) int {
    ret := 0
    weeks := n / 7
    n %= 7

    for n > 0 {
        ret += n + weeks
        n--
    }

    weeks--;

    for weeks > -1 {
        ret += 28 + (weeks * 7)
        weeks--
    }

    return ret
}