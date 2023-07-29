class Solution {
public:
    int longestCommonSubsequence(string text1, string text2) {
        vector<vector<int>> ret(text1.size()+1);
        
        for (int i = 0; i <= text1.size(); ++i) ret[i] = vector<int>(text2.size()+1, 0);
        
        for (int i = text1.size()-1; i > -1; i--){
            for (int j = text2.size()-1; j > -1; j--){
                if (text1[i] == text2[j]) ret[i][j] += 1 + ret[i+1][j+1];
                else ret[i][j] += max(ret[i+1][j], ret[i][j+1]);
            }
        }
        
        return ret[0][0];
    }
};