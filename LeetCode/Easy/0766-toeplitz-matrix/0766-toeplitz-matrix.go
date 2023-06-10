func isToeplitzMatrix(matrix [][]int) bool {
    for row := 1; row < len(matrix); row++ {
        for col := 1; col < len(matrix[0]); col++ {
            if matrix[row][col] != matrix[row-1][col-1] { return false }
        }
    }
    return true
}