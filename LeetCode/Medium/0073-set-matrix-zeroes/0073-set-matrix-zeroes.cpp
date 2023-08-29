class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int rowLen = matrix.size();
        int colLen = matrix[0].size();
        vector<int> row (rowLen);
        vector<int> col (colLen);
        
        for (int r = 0; r < rowLen; ++r){
            for (int c = 0; c < colLen; ++c){
                if (!matrix[r][c]){
                    row[r] = 1;
                    col[c] = 1;
                }
            }
        }
        
        for (int r = 0; r < rowLen; ++r){
            for (int c = 0; c < colLen; ++c){
                if (row[r] || col[c]) matrix[r][c] = 0;
            }
        }
    }
};