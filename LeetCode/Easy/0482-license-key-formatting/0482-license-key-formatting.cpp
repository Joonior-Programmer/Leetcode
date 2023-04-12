class Solution {
public:
    string licenseKeyFormatting(string s, int k) {
        int i = s.size() - 1;
        int temp = k;
        stringstream ss;
        while (i > -1) {
            if (s[i] != '-'){
                if (s[i] >= 'a' && s[i] <= 'z'){
                    if (temp == 0 && i > -1) {
                        ss << '-';
                        temp = k;
                    }
                    ss << (char) (s[i] - 32);
                    i--;
                    temp--;
                    
                }
                else {
                    if (temp == 0 && i > -1) {
                        ss << '-';
                        temp = k;
                    }
                    ss << s[i];
                    i--;
                    temp--;
                    
                }
                
            }
            else i--;
            
        }
        string ret = ss.str();
        reverse(ret.begin(), ret.end());
        return ret;
    }
};