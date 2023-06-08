func countNegatives(grid [][]int) int {
    end := len(grid[0])
    ret := 0
    var left int
    var right int
    var mid int

    for row := 0; row < len(grid); row++ {
        left = 0;
        right = end - 1
        for left <= right {
            mid = (left + right) / 2

            if grid[row][mid] > -1 {
                left = mid + 1
            } else {right = mid - 1}
        }

        ret += end - left;
    }

    return ret;
}