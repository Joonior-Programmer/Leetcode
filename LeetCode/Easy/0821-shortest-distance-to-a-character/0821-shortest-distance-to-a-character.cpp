class Solution {
public:
    vector<int> shortestToChar(string s, char c) {
        int n = s.size();
        vector<int> ret;
        int val = 9999;
        
        for (int i = 0; i < n; ++i){
            if (s[i] == c){
                ret.push_back(0);
                val = 1;
            } else {
                ret.push_back(val++);
            }
        }
        
        val = 9999;
        
        for (int i = n - 1; i > -1; i--){
            if (s[i] == c){
                ret[i] = 0;
                val = 1;
            } else {
                ret[i] = min(ret[i], val++);
            }
        }
        
        return ret;
    }
};