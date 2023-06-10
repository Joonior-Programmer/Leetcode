class Solution {
public:
    bool isToeplitzMatrix(vector<vector<int>>& matrix) {
        for (int row = 1; row < matrix.size(); ++row){
            for (int col = 1; col < matrix[0].size(); ++col){
                if (matrix[row-1][col-1] != matrix[row][col]) return false;
            }
        }
        return true;
    }
};