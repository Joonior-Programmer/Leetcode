class Solution {
public:
    int longestPalindrome(string s) {
        int counter[58]{0};
        int ret = 0;
        for(int i = 0; i < s.size(); ++i) ++counter[s[i] - 65];
        
        for(int i = 0; i < 58; ++i){
            ret += counter[i] / 2 * 2;
            if (ret % 2 == 0 && counter[i] % 2 == 1) ++ret;
        }
        return ret;
    }
};