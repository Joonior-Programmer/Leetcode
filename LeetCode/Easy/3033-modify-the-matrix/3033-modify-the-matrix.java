class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] max = new int[matrix[0].length];
        
        for (int col = 0; col < matrix[0].length; ++col)
            for (int row = 0; row < matrix.length; ++row)
                max[col] = Math.max(max[col], matrix[row][col]);
        
        for (int col = 0; col < matrix[0].length; ++col)
            for (int row = 0; row < matrix.length; ++row)
                if (matrix[row][col] == -1)
                    matrix[row][col] = max[col];
        
        return matrix;
    }
}