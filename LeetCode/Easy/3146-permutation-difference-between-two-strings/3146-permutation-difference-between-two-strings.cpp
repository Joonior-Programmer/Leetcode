class Solution {
public:
    int findPermutationDifference(string s, string t) {
        int ret = 0;
        vector<int> idxs(26);
        
        for (int i = 0; i < s.size(); ++i) idxs[s[i]-'a'] = i;
        
        for (int i = 0; i < s.size(); ++i) ret += abs(idxs[t[i]-'a'] - i);
        
        return ret;
    }
};