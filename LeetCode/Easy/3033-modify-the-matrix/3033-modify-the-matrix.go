func modifiedMatrix(matrix [][]int) [][]int {
    maxVal := make([]int, len(matrix[0]))
        
    for col := 0; col < len(matrix[0]); col++ {
        temp := -1
        for row := 0; row < len(matrix); row++ { 
            temp = max(temp, matrix[row][col])
        }
        maxVal[col] = temp
    }

    for col := 0; col < len(matrix[0]); col++ {
        for row := 0; row < len(matrix); row++ {
            if matrix[row][col] == -1 {
                matrix[row][col] = maxVal[col]
            }
        }
    }
    
    return matrix
}

func max(a, b int) int {
    if a > b { return a }
    return b
}