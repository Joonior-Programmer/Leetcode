func maxMoves(grid [][]int) int {
    rowLen := len(grid)
	colLen := len(grid[0])

	prev := make([]bool, rowLen)

	for i := range prev {
		prev[i] = true
	}

	for col := 1; col < colLen; col++ {
		curr := make([]bool, rowLen)

		for row := 0; row < rowLen; row++ {
			if row > 0 && grid[row-1][col-1] < grid[row][col] {
				curr[row] = curr[row] || prev[row-1]
			}
			if row < rowLen-1 && grid[row+1][col-1] < grid[row][col] {
				curr[row] = curr[row] || prev[row+1]
			}
			if grid[row][col-1] < grid[row][col] {
				curr[row] = curr[row] || prev[row]
			}
		}

		isGood := false
		for i := 0; i < rowLen; i++ {
			if curr[i] {
				isGood = true
				break
			}
		}

		if !isGood {
			return col - 1
		}

		prev = curr
	}

	return colLen - 1
}