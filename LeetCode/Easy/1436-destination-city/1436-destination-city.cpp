class Solution {
public:
    string destCity(vector<vector<string>>& paths) {
        unordered_map<string, string> s;
        
        for (vector<string> v : paths)
            s[v[0]] = v[1];
        
        string ret = paths[0][1];
        
        while (s.find(ret) != s.end()) ret = s[ret];
        
        return ret;
    }
};