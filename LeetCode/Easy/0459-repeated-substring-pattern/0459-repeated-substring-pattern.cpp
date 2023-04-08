class Solution {
public:
    bool repeatedSubstringPattern(string s) {
        int len = s.length();
        for (int i = len / 2; i > 0; i--){
            if (len % i == 0 && s[i-1] == s[len-1]){
                stringstream ss;
                for (int j = 0; j < len / i; ++j) ss << s.substr(0, i);
                if (ss.str() == s) return true;
            }
        }
        return false;
    }
};