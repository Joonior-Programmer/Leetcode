func minFallingPathSum(matrix [][]int) int {
    n := len(matrix) - 1
    ret := 4289999999

    for i := n - 1; i > -1; i-- {
        matrix[i][n] += min(matrix[i+1][n-1], matrix[i+1][n]);
        matrix[i][0] += min(matrix[i+1][0], matrix[i+1][1]);
        for j := n - 1; j > 0; j-- {
            matrix[i][j] += min(matrix[i+1][j-1], min(matrix[i+1][j], matrix[i+1][j+1]))
        }
    }           

    for i := 0; i < len(matrix); i++ { ret = min(ret, matrix[0][i]) }

    return ret;
}


func min (a, b int) int {
    if a < b { return a }
    return b
}