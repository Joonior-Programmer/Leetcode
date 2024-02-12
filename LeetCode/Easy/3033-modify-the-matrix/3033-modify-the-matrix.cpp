class Solution {
public:
    vector<vector<int>> modifiedMatrix(vector<vector<int>>& matrix) {
        vector<int> maxVal(matrix[0].size());
        
        for (int col = 0; col < matrix[0].size(); ++col){
            int temp = -1;
            for (int row = 0; row < matrix.size(); ++row)
                temp = max(temp, matrix[row][col]);
            maxVal[col] = temp;
        }
        
        for (int col = 0; col < matrix[0].size(); ++col)
            for (int row = 0; row < matrix.size(); ++row)
                if (matrix[row][col] == -1)
                    matrix[row][col] = maxVal[col];
        
        return matrix;
    }
};