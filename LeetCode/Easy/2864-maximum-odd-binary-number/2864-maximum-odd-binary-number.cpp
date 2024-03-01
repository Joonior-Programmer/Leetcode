class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int n = s.size();
        int count = 0;
        string ret = "";
        
        for (int i = 0; i < n; ++i)
            if (s[i] == '1') ++count;
        
        for (int i = 0; i < count - 1; ++i) ret += '1';
        for (int i = 0; i < n - count; ++i) ret += '0';
        ret += '1';
        
        return ret;
    }
};