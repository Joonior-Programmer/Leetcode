class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int repeat = n / 2;
        int i = 0;
        while (i < repeat){
            for (int j = i; j < n-i-1; ++j){
                int topLeft = matrix[i][j];
                int topRight = matrix[j][n-i-1];
                int botRight = matrix[n-i-1][n-j-1];
                int botLeft = matrix[n-j-1][i];

                matrix[i][j] = botLeft;
                matrix[j][n-i-1] = topLeft;
                matrix[n-i-1][n-j-1] = topRight;
                matrix[n-j-1][i] = botRight;
            }
            ++i;
        }
    }
};