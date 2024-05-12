func largestLocal(grid [][]int) [][]int {
    n := len(grid)
    ret := make([][]int, n-2)
    
    for i := 0; i < n-2; i++ { ret[i] = make([]int, n-2) }

    for i := 1; i < n - 1; i++ {
        for j := 1; j < n - 1; j++ {
            max := 0

            for idx1 := i - 1; idx1 < i + 2; idx1++ {
                for idx2 := j - 1; idx2 < j + 2; idx2++ {
                    if grid[idx1][idx2] > max { max = grid[idx1][idx2] }
                }
            }
            ret[i-1][j-1] = max
        }
    }

    return ret
}