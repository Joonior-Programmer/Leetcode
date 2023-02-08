class Solution {
public:
    bool isPalindrome(string s) {
        string ret = "";
        for (int i = 0; i < s.length(); ++i){
            char temp = s[i];
            if (temp >= 'a' && temp <= 'z' || temp >= '0' && temp <= '9'){
                ret += temp;
            } else if (temp >= 'A' && temp <= 'Z') {
                ret += temp - 65 + 97;
            }
        }
        string reverseRet = ret;
        reverse(reverseRet.begin(), reverseRet.end());
        return reverseRet == ret;
    }
};