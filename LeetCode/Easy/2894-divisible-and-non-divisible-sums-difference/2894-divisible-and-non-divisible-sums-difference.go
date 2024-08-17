func differenceOfSums(n int, m int) int {
    ret := n * (n + 1) / 2

    for i := m; i < n + 1; i += m { ret -= i * 2 }

    return ret
}