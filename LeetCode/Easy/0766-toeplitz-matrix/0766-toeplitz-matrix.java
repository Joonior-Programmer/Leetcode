class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int row = 1; row < matrix.length; ++row){
            for (int col = 1; col < matrix[0].length; ++col){
                if (matrix[row-1][col-1] != matrix[row][col]) return false;
            }
        }
        return true;
    }
}