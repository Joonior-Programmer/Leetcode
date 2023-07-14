class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> q = new LinkedList();

        int rowLen = maze.length - 1;
        int colLen = maze[0].length - 1;

        for (int i = 0; i < colLen+1; ++i) {
            if (maze[0][i] == '.' && (0 != entrance[0] || i != entrance[1])) {
                q.add(createIntArray(0, i));
                maze[0][i] = '+';
            }
            if (maze[rowLen][i] == '.' && (rowLen != entrance[0] || i != entrance[1])) {
                q.add(createIntArray(rowLen, i));
                maze[rowLen][i] = '+';
            }
        }

        for (int i = 0; i < rowLen+1; ++i) {
            if (maze[i][0] == '.' && (i != entrance[0] || 0 != entrance[1])) {
                q.add(createIntArray(i, 0));
                maze[i][0] = '+';
            }
            if (maze[i][colLen] == '.' && (i != entrance[0] || colLen != entrance[1])){
                q.add(createIntArray(i, colLen));
                maze[i][colLen] = '+';
            } 

        }

        int ret = -1;
        int temp = 0;

        while (ret == -1 && !q.isEmpty()){
            Queue<int[]> tempQ = new LinkedList();
            while(!q.isEmpty()){
                int[] coord = q.poll();
                if (coord[0] == entrance[0] && coord[1] == entrance[1]) {
                    ret = temp;
                    break;
                }

                if (coord[0] > 0 && maze[coord[0]-1][coord[1]] == '.'){
                    tempQ.add(createIntArray(coord[0]-1, coord[1]));
                    maze[coord[0]-1][coord[1]] = '+';
                }
                if (coord[0] < rowLen && maze[coord[0]+1][coord[1]] == '.') {
                    tempQ.add(createIntArray(coord[0]+1, coord[1]));
                    maze[coord[0]+1][coord[1]] = '+';
                }
                if (coord[1] > 0 && maze[coord[0]][coord[1]-1] == '.') {
                    tempQ.add(createIntArray(coord[0], coord[1]-1));
                    maze[coord[0]][coord[1]-1] = '+';
                }
                if (coord[1] < colLen && maze[coord[0]][coord[1]+1] == '.') {
                    tempQ.add(createIntArray(coord[0], coord[1]+1));
                    maze[coord[0]][coord[1]+1] = '+';
                }
            }

            ++temp;
            q = tempQ;
        }

        return ret;
    }

    private int[] createIntArray(int x, int y){
        int[] array = new int[2];
        array[0] = x;
        array[1] = y;
        return array;
    }
}