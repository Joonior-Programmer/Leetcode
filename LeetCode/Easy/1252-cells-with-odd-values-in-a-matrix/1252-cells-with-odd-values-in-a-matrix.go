func oddCells(m int, n int, indices [][]int) int {
    matrix := make([][]int, m)
    
    for i := 0; i < m; i++ { matrix[i] = make([]int, n) }

    for _, v := range indices {
        row := v[0]
        col := v[1]

        for i := 0; i < n; i++ { matrix[row][i]++ }

        for i := 0; i < m; i++ { matrix[i][col]++ }
    }

    ret := 0

    for row := 0; row < m; row++ {
        for col := 0; col < n; col++ {
            if matrix[row][col] % 2 == 1 { ret++ }
        }
    }

    return ret
}