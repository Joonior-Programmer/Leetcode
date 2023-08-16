class Solution {
public:
    string convert(string s, int numRows) {
        int n = s.size();
        if (numRows == 1 || n <= numRows) return s;
        
        string ret = "";
        int cycle = 2 * numRows - 2;
        
        for (int i = 0; i < numRows; ++i){
            for (int j = 0; j + i < n; j += cycle){
                ret += s[i+j];
                
                if (i != 0 && i != numRows - 1 && j + cycle - i < n) ret += s[j+cycle-i];
            }
        }
        
        return ret;
    }
};