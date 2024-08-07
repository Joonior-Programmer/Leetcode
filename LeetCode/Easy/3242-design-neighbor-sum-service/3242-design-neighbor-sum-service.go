type neighborSum struct {
    grid  [][]int
	coord [][2]int
	n     int
}


func Constructor(grid [][]int) neighborSum {
    n := len(grid)
	coord := make([][2]int, n*n)

	for row := 0; row < n; row++ {
		for col := 0; col < n; col++ {
			val := grid[row][col]
			coord[val] = [2]int{row, col}
		}
	}

	return neighborSum{
		grid:  grid,
		coord: coord,
		n:     n - 1,
	}
}


func (this *neighborSum) AdjacentSum(value int) int {
    ret := 0
	row, col := this.coord[value][0], this.coord[value][1]

	if row > 0 {
		ret += this.grid[row-1][col]
	}
	if row < this.n {
		ret += this.grid[row+1][col]
	}
	if col > 0 {
		ret += this.grid[row][col-1]
	}
	if col < this.n {
		ret += this.grid[row][col+1]
	}

	return ret
}


func (this *neighborSum) DiagonalSum(value int) int {
    ret := 0
	row, col := this.coord[value][0], this.coord[value][1]

	if row > 0 {
		if col > 0 {
			ret += this.grid[row-1][col-1]
		}
		if col < this.n {
			ret += this.grid[row-1][col+1]
		}
	}
	if row < this.n {
		if col > 0 {
			ret += this.grid[row+1][col-1]
		}
		if col < this.n {
			ret += this.grid[row+1][col+1]
		}
	}

	return ret
}


/**
 * Your neighborSum object will be instantiated and called as such:
 * obj := Constructor(grid);
 * param_1 := obj.AdjacentSum(value);
 * param_2 := obj.DiagonalSum(value);
 */