class Solution {
    public int orangesRotting(int[][] grid) {
        int ret = -1;
        boolean isFreshExist = false;
        Queue<int[]> q = new LinkedList();
        int rowLen = grid.length - 1;
        int colLen = grid[0].length - 1;
        
        for (int i = 0; i < rowLen + 1; ++i){
            for (int j = 0; j < colLen + 1; ++j){
                if (grid[i][j] == 2) q.offer(createCoord(i, j));
                else if (grid[i][j] == 1) isFreshExist = true;
            }
        }
        
        if (q.isEmpty()){
            if (isFreshExist) return ret;
            return 0;
        }
        
        while (!q.isEmpty()){
            Queue<int[]> tempQ = new LinkedList();
            
            while (!q.isEmpty()){
                int[] coord = q.poll();
                int row = coord[0];
                int col = coord[1];

                if (row > 0 && grid[row-1][col] == 1) {
                    tempQ.offer(createCoord(row-1, col));
                    grid[row-1][col] = 2;
                } 
                if (row < rowLen && grid[row+1][col] == 1){
                    tempQ.offer(createCoord(row+1, col));
                    grid[row+1][col] = 2;
                } 
                if (col > 0 && grid[row][col-1] == 1){
                    tempQ.offer(createCoord(row, col-1));
                    grid[row][col-1] = 2;
                } 
                if (col < colLen && grid[row][col+1] == 1){
                    tempQ.offer(createCoord(row, col+1));
                    grid[row][col+1] = 2;
                }
            }

            q = tempQ;
            ++ret;
        }

        for (int i = 0; i < rowLen + 1; ++i){
            for (int j = 0; j < colLen + 1; ++j){
                if (grid[i][j] == 1) return -1;
            }
        }
        
        return ret;
    }
    
    private int[] createCoord(int row, int col){
        int[] ret = new int[2];
        ret[0] = row;
        ret[1] = col;
        return ret;
    }
}