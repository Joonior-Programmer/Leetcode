func luckyNumbers (matrix [][]int) []int {
    colMax := make([]int, len(matrix[0]))
    rowMin := make([]int, len(matrix))
    ret := make([]int, 0)

    for i := 0; i < len(rowMin); i++ { rowMin[i] = 999999 }
    
    for row := 0; row < len(matrix); row++ {
        for col := 0; col < len(matrix[0]); col++ {
            temp := matrix[row][col]
            colMax[col] = max(colMax[col], temp)
            rowMin[row] = min(rowMin[row], temp)
        }
    }

    for row := 0; row < len(matrix); row++ {
        for col := 0; col < len(matrix[0]); col++ {
            if matrix[row][col] == rowMin[row] && matrix[row][col] == colMax[col] { 
                ret = append(ret, rowMin[row])
            }
        }
    }

    return ret
}

func max(a, b int) int {
    if a > b { return a }
    return b
}

func min(a, b int) int {
    if a < b { return a }
    return b
}