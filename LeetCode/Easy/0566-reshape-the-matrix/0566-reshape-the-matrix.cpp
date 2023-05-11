class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
        if (mat.size() * mat[0].size() != r * c) return mat;
        
        vector<vector<int>> ret(r, vector<int>(c));
        int row = 0;
        int col = 0;
        
        for (int i = 0; i < mat.size(); ++i){
            for (int j = 0; j < mat[0].size(); ++j) {
                if (col == c) {
                    ++row;
                    col = 0;
                }
                ret[row][col++] = mat[i][j];
            }
        }
        
        return ret;
    }
};