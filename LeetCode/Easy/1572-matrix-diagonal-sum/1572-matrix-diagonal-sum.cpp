class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int ret = 0;
        int end = mat.size() - 1;
        for (int i = 0; i < (end + 1) / 2; ++i){
            ret += mat[i][i] + mat[i][end-i] + mat[end-i][i] + mat[end-i][end-i];
        }
        if ((end + 1) % 2 != 0){
            ret += mat[(end+1)/2][(end+1)/2];
        }
        return ret;
    }
};