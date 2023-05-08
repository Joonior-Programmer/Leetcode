func diagonalSum(mat [][]int) int {
    ret := 0
    end := len(mat) - 1
    for i := 0; i < (end + 1) / 2; i++ {
        ret += mat[i][i] + mat[i][end-i] + mat[end-i][i] + mat[end-i][end-i]
    }
    if (end+1) % 2 != 0 {
        ret += mat[(end+1)/2][(end+1)/2]
    }
    return ret
}