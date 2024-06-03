class Solution {
public:
    int appendCharacters(string s, string t) {
        int n = s.size();
        int m = t.size();
        int j = 0;
        
        for (int i = 0; i < n; ++i){
            if (j == m) break;
            if (s[i] == t[j]) ++j;
        }
        
        return m - j;
    }
};