class Solution {
public:
    vector<int> luckyNumbers (vector<vector<int>>& matrix) {
        vector<int> colMax(matrix[0].size());
        vector<int> rowMin(matrix.size(), 999999);
        vector<int> ret;
        
        for (int row = 0; row < matrix.size(); ++row){
            for (int col = 0; col < matrix[0].size(); ++col){
                int temp = matrix[row][col];
                colMax[col] = max(colMax[col], temp);
                rowMin[row] = min(rowMin[row], temp);
            }
        }
        
        for (int row = 0; row < matrix.size(); ++row){
            for (int col = 0; col < matrix[0].size(); ++col){
                if (matrix[row][col] == rowMin[row] && matrix[row][col] == colMax[col]) 
                    ret.push_back(rowMin[row]);
            }
        }
        
        return ret;
    }
};