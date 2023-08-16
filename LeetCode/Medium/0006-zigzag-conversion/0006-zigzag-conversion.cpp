class Solution {
public:
    string convert(string s, int numRows) {
        if (numRows == 1) return s;
        
        int i = 0;
        int n = s.size();
        vector<string> zigzag(numRows, "");
        
        string ret = "";
        
        while(i < n){
            for (int idx = 0; idx < numRows && i < n; ++idx) zigzag[idx] += s[i++];
            for (int idx = numRows - 2; idx > 0 && i < n; idx--) zigzag[idx] += s[i++];
        }
        
        for (string v : zigzag) ret += v;
        
        return ret;
    }
};