func construct2DArray(original []int, m int, n int) [][]int {
    if len(original) != m * n { return [][]int{} }

    ret := make([][]int, 0)

    for row := 0; row < m; row++ {
        ret = append(ret, original[row * n : (row + 1) * n]) 
    }

    return ret
}