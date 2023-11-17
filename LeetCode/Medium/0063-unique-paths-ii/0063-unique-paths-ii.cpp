class Solution {
public:
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        int rowLen = obstacleGrid.size();
        int colLen = obstacleGrid[0].size();
            
        if (obstacleGrid[0][0] == 1 || obstacleGrid[rowLen-1][colLen-1] == 1)
            return 0;
            
        int i = 0;

        while (i < rowLen) {
            if (obstacleGrid[i][0] == 0) obstacleGrid[i++][0] = 1;
            else {
                while (i < rowLen) obstacleGrid[i++][0] = 0;
            }
        }
    
        i = 1;
        
        while (i < colLen){
            if (obstacleGrid[0][i] == 0) obstacleGrid[0][i++] = 1;
            else {
                while (i < colLen) obstacleGrid[0][i++] = 0;
            }
        }

        for (int row = 1; row < rowLen; ++row){
            for (int col = 1; col < colLen; ++col){
                if (obstacleGrid[row][col] != 1)
                    obstacleGrid[row][col] = obstacleGrid[row-1][col] + 
                                                obstacleGrid[row][col-1];
                else
                    obstacleGrid[row][col] = 0;
            }
        }
        
        return obstacleGrid[rowLen-1][colLen-1];
    }
};