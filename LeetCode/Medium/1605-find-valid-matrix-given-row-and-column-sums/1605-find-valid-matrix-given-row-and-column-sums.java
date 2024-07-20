class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rowLen = rowSum.length;
        int colLen = colSum.length;
        int[][] ret = new int[rowLen][colLen];
        int i = 0;
        int j = 0;

        while (i < rowLen && j < colLen){
            if (rowSum[i] < colSum[j]){
                ret[i][j] = rowSum[i];
                colSum[j] -= rowSum[i];
                rowSum[i] = 0;
                ++i;
            } else {
                ret[i][j] = colSum[j];
                rowSum[i] -= colSum[j];
                colSum[j] = 0;
                ++j;
            }
        }
        
        return ret;
    }
}