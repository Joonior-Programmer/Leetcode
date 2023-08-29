class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int[] row = new int[rowLen];
        int[] col = new int[colLen];

        for (int r = 0; r < rowLen; ++r){
            for (int c = 0; c < colLen; ++c){
                if (matrix[r][c] == 0) {
                    row[r] = 1;
                    col[c] = 1;
                }
            }
        }

        for (int r = 0; r < rowLen; ++r){
            for (int c = 0; c < colLen; ++c){
                if (row[r] == 1 || col[c] == 1) matrix[r][c] = 0;
            }
        }
    }
}