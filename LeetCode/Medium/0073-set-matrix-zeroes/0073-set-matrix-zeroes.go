func setZeroes(matrix [][]int)  {
    rowLen := len(matrix)
    colLen := len(matrix[0])
    
    row := make([]int, rowLen)
    col := make([]int, colLen)
    
    for r := 0; r < rowLen; r++ {
        for c := 0; c < colLen; c++ {
            if matrix[r][c] == 0 {
                row[r] = 1
                col[c] = 1
            }
        }
    }
    
    for r := 0; r < rowLen; r++ {
        for c := 0; c < colLen; c++ {
            if row[r] == 1 || col[c] == 1 {
                matrix[r][c] = 0
            }
        }
    }
}