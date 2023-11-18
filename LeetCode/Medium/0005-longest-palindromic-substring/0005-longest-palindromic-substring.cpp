class Solution {
public:
    string longestPalindrome(string s) {
        int n = s.size();
        int retL = 0;
        int retR = 0;
        
        for (int i = 0; i < n; ++i){
            int l = i;
            int r = i;
            
            while (l > -1 && r < n && s[l] == s[r]){
                if (retR - retL < r - l){
                    retR = r;
                    retL = l;
                }
                ++r;
                l--;
            }
            
            l = i;
            r = i + 1;
            
            while (l > -1 && r < n && s[l] == s[r]){
                if (retR - retL < r - l){
                    retR = r;
                    retL = l;
                }
                ++r;
                l--;
            }
        }
        
        return s.substr(retL, retR - retL+1);
    }
};