func transpose(matrix [][]int) [][]int {
    n := len(matrix)
    m := len(matrix[0])
    ret := make([][]int, m)

    for i := 0; i < m; i++ {
        ret[i] = make([]int, n)
        for j := 0; j < n; j++ {
            ret[i][j] = matrix[j][i]
        }
    }
    
    return ret
}