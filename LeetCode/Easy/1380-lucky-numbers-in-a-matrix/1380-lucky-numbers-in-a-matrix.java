class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] colMax = new int[matrix[0].length];
        int[] rowMin = new int[matrix.length];

        for (int i = 0; i < rowMin.length; ++i) rowMin[i] = 999999;

        List<Integer> ret = new ArrayList();
        
        for (int row = 0; row < matrix.length; ++row){
            for (int col = 0; col < matrix[0].length; ++col){
                int temp = matrix[row][col];
                colMax[col] = Math.max(colMax[col], temp);
                rowMin[row] = Math.min(rowMin[row], temp);
            }
        }
        
        for (int row = 0; row < matrix.length; ++row){
            for (int col = 0; col < matrix[0].length; ++col){
                if (matrix[row][col] == rowMin[row] && matrix[row][col] == colMax[col]) 
                    ret.add(rowMin[row]);
            }
        }
        
        return ret;
    }
}