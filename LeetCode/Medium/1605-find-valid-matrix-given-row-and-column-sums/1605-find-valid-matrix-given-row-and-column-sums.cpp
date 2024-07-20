class Solution {
public:
    vector<vector<int>> restoreMatrix(vector<int>& rowSum, vector<int>& colSum) {
        int rowLen = rowSum.size();
        int colLen = colSum.size();
        vector<vector<int>> ret(rowLen, vector<int>(colLen));
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
};