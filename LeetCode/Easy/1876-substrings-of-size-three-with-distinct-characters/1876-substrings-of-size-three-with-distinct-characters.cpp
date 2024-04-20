class Solution {
public:
    int countGoodSubstrings(string s) {
        if (s.size() < 3) return 0;
        
        vector<int> count(26);
        int dup = 0;
        int ret = 0;
        ++count[s[0]-97];
        
        for (int i = 1; i < 3; ++i)
            if (count[s[i] - 97]++ > 0) ++dup;
        
        if (dup == 0) ++ret;
        
        for (int i = 3; i < s.size(); ++i){
            if (count[s[i-3]-97]-- > 1) dup--;
            if (count[s[i]-97]++ > 0) ++dup;
            if (dup == 0) ++ret;
        }
        return ret;
    }
};