func uniquePathsWithObstacles(obstacleGrid [][]int) int {
    rowLen := len(obstacleGrid)
    colLen := len(obstacleGrid[0])

    if obstacleGrid[0][0] == 1 || obstacleGrid[rowLen-1][colLen-1] == 1 { return 0 }

    i := 0

    for i < rowLen {
        if obstacleGrid[i][0] == 0 {
            obstacleGrid[i][0] = 1
            i++
        } else {
            for i < rowLen {
                obstacleGrid[i][0] = 0 
                i++
            }
        }
    }

    i = 1;

    for i < colLen {
        if obstacleGrid[0][i] == 0 { 
            obstacleGrid[0][i] = 1
            i++
        } else {
            for i < colLen { 
                obstacleGrid[0][i] = 0
                i++
            }
        }
    }

    for row := 1; row < rowLen; row++ {
        for col := 1; col < colLen; col++ {
            if obstacleGrid[row][col] != 1 {
                obstacleGrid[row][col] = obstacleGrid[row-1][col] + 
                                            obstacleGrid[row][col-1]
            } else {
                obstacleGrid[row][col] = 0
            }
        }
    }

    return obstacleGrid[rowLen-1][colLen-1]
}