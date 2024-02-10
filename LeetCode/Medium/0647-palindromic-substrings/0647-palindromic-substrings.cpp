class Solution {
public:
    int countSubstrings(string s) {
        int n = s.size();
        int ret = n;
        
        for (int i = 0; i < n; ++i){
            int l = i-1;
            int r = i+1;
            
            while (l > -1 && r < n){
                if (s[l] == s[r]) ++ret;
                else break;
                l--;
                ++r;
            }
            
            l = i;
            r = i+1;
            
            while (l > -1 && r < n){
                if (s[l] == s[r]) ++ret;
                else break;
                l--;
                ++r;
            }
        }
        
        return ret;
    }
};