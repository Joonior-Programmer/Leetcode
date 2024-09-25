class Solution {
public:
    vector<vector<int>> largeGroupPositions(string s) {
        vector<vector<int>> ret;
        int i = 0;
        int n = s.size();
        
        while (i < n){
            int j = i + 1;
            char v = s[i];
            
            while (j < n && v == s[j]) j++;
            
            if (j - i > 2) ret.push_back(vector<int>{i, j - 1});
            i = j;
        }
        
        return ret;
    }
};