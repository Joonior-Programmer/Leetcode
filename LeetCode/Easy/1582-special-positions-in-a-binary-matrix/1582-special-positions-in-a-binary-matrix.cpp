class Solution {
public:
    int numSpecial(vector<vector<int>>& mat) {
        int ret = 0;
        int rowLen = mat.size();
        int colLen = mat[0].size();
        
        for (int row = 0; row < rowLen; ++row){
            for (int col = 0; col < colLen; ++col){
                if (mat[row][col] == 1){
                    bool condition = true;
                    mat[row][col] = 0;
                    
                    for (int i = 0; i < rowLen; ++i)
                        if (mat[i][col] == 1){
                            condition = false;
                            break;
                        }
                    
                    if (condition)
                        for (int i = 0; i < colLen; ++i)
                            if (mat[row][i] == 1){
                                condition = false;
                                break;
                            }
                    
                    if (condition) ++ret;
                    mat[row][col] = 1;                    
                }
            }
        }
        
        return ret;
    }
};