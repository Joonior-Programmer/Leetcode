func maximalSquare(matrix [][]byte) int {
    rowLen := len(matrix)
	colLen := len(matrix[0])
	ret := 0
	dp := make([][]int, rowLen)

	for i := range dp {
		dp[i] = make([]int, colLen)
	}

	for i := 0; i < rowLen; i++ {
		for j := 0; j < colLen; j++ {
			if matrix[i][j] == '1' {
				dp[i][j] = 1
				ret = 1
			}
		}
	}

	for i := 1; i < rowLen; i++ {
		for j := 1; j < colLen; j++ {
			if dp[i][j] == 1 {
				dp[i][j] = min(dp[i-1][j], min(dp[i][j-1], dp[i-1][j-1])) + 1
				ret = max(ret, dp[i][j])
			}
		}
	}

	return ret * ret
}

func max(a, b int) int {
    if a > b { return a }
    return b
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}