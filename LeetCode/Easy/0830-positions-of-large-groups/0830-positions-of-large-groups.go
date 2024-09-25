func largeGroupPositions(s string) [][]int {
    ret := make([][]int, 0)
    i := 0
    n := len(s)

    for i < n {
        j := i + 1
        v := s[i]

        for j < n && v == s[j] { j++ }

        if j - i > 2 { ret = append(ret, []int{i, j - 1}) }
        i = j
    }

    return ret
}