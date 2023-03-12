class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> ret = split(s, " ");
        if (ret.size() != pattern.length()) return false;
        unordered_set<string> used;
        string container[26]{""};
        for (int i = 0; i < pattern.length(); ++i){
            if (container[pattern[i] - 'a'] == "" && used.find(ret[i]) == used.end()){
                container[pattern[i] - 'a'] = ret[i];
                used.insert(ret[i]);
            } else if (container[pattern[i] - 'a'] != ret[i]) {
                return false;
            }
        }
        return true;
    }
    
    vector<string> split(string s, string delimiter){
        vector<string> container;
        long long pos = 0;
        string token;
        while((pos = s.find(delimiter)) != string::npos){
            token = s.substr(0, pos);
            container.push_back(token);
            s.erase(0, pos+delimiter.length());
        }
        container.push_back(s);
        return container;
    }
    
};