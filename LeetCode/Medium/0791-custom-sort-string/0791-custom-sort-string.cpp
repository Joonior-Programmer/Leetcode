class Solution {
public:
    string customSortString(string order, string s) {
        int n = s.size();
        vector<int> count(26);
        int i = 0;
        vector<char> ret(n);
        
        for (int j = 0; j < n; ++j) ++count[s[j]-97];
        
        for (char v : order){
            for (int j = 0; j < count[v-97]; ++j) ret[i++] = v;
            count[v-97] = 0;
        }
        
        for (int j = 0; j < 26; ++j){
            for (int k = 0; k < count[j]; ++k) ret[i++] = (char) (j + 97);
        }
        
        string res(ret.begin(), ret.end());
        
        return res;
    }
};