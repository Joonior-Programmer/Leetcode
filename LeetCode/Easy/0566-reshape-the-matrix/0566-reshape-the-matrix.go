func matrixReshape(mat [][]int, r int, c int) [][]int {
    if r * c != len(mat) * len(mat[0]) { return mat }
    
    ret := make([][]int, r)
    for i := 0; i < r; i++ {
        ret[i] = make([]int, c)
    }
    
    row := 0
    col := 0
    
    for i := 0; i < len(mat); i++ {
        for j := 0; j < len(mat[0]); j++ {
            if col == c {
                col = 0
                row++
            }
            ret[row][col] = mat[i][j]
            col++
        }
    }
    return ret
}