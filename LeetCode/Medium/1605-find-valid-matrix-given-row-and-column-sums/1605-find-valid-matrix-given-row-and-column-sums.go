func restoreMatrix(rowSum []int, colSum []int) [][]int {
    rowLen := len(rowSum)
    colLen := len(colSum)
    ret := make([][]int, rowLen)
    
    for i := 0; i < rowLen; i++ { ret[i] = make([]int, colLen) }
    
    i := 0
    j := 0

    for i < rowLen && j < colLen {
        if rowSum[i] < colSum[j] {
            ret[i][j] = rowSum[i]
            colSum[j] -= rowSum[i]
            rowSum[i] = 0
            i++
        } else {
            ret[i][j] = colSum[j]
            rowSum[i] -= colSum[j]
            colSum[j] = 0
            j++
        }
    }

    return ret
}