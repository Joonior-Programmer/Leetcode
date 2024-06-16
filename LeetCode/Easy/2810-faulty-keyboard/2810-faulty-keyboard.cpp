class Solution {
public:
    string finalString(string s) {
        string ret = "";
        
        for (char v : s)
            if (v == 'i') reverse(ret.begin(), ret.end());
            else ret += v;
        
        return ret;
    }
};