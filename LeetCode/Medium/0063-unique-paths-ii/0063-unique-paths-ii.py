class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        if obstacleGrid[0][0] or obstacleGrid[-1][-1]:
            return 0
            
        row_len = len(obstacleGrid)
        col_len = len(obstacleGrid[0])

        for i in range(row_len):
            if obstacleGrid[i][0] == 0:
                obstacleGrid[i][0] = 1
            else:
                while i < row_len:
                    obstacleGrid[i][0] = 0
                    i += 1
                break

        for i in range(1, col_len):
            if obstacleGrid[0][i] == 0:
                obstacleGrid[0][i] = 1
            else:
                while i < col_len:
                    obstacleGrid[0][i] = 0
                    i += 1
                break

        for row in range(1, row_len):
            for col in range(1, col_len):
                if obstacleGrid[row][col] != 1:
                    obstacleGrid[row][col] = obstacleGrid[row-1][col] + \
                                                obstacleGrid[row][col-1]
                else:
                    obstacleGrid[row][col] = 0
        
        return obstacleGrid[row_len-1][col_len-1]