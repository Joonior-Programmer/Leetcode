class Solution {
public:
    string licenseKeyFormatting(string s, int k) {
        int temp = k;
        string ret;
        for (int i = s.length()-1; i > -1; i--){
            if (s[i] != '-') {
                if (!temp) {
                    ret += "-";
                    temp = k;
                }
                ret += toupper(s[i]);
                temp--;
            }
            
        }
        reverse(ret.begin(), ret.end());
        return ret;
    }
};