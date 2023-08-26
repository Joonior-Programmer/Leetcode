class Solution {
public:
    string minWindow(string s, string t) {
        int count[128] = {0};
        int needCount = t.length();
        int start = 0, end = INT_MAX;
        int l = 0;
        
        for (char c : t) ++count[c];
        
        for (int r = 0; r < s.size(); ++r) {
            if (count[s[r]] > 0) needCount--;
            
            count[s[r]]--;
            
            if (needCount == 0) {
                while (count[s[l]] != 0) ++count[s[l++]];
                
                if (end - start > r - l) {
                    end = r;
                    start = l;
                }
                
                ++needCount;
                ++count[s[l++]];
            }
        }
        
        if (end == INT_MAX) return "";
        
        return s.substr(start, end - start + 1);
    }
};