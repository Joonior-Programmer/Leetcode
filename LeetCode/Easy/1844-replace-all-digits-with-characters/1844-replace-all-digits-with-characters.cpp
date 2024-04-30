class Solution {
public:
    string replaceDigits(string s) {
        int n = s.length();
        string ret = "";
        
        for (int i = 0; i < n; ++i){
            if (s[i] < 97) ret += (char) (s[i-1] + s[i] - '0');
            else ret += s[i];
        }
        
        return ret;
    }
};