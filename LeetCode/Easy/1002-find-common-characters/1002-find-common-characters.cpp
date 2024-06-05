class Solution {
public:
    vector<string> commonChars(vector<string>& words) {
        vector<int> count(26, 101);
        vector<string> ret;
        
        for (string word : words){
            vector<int> temp(26);
            for (char v : word) ++temp[v-97];
            
            for (int i = 0; i < 26; ++i) count[i] = min(count[i], temp[i]);
        }
        
        for (int i = 0; i < 26; ++i)
            for (int j = 0; j < count[i]; ++j) ret.push_back(string() + (char)(i+'a'));
        
        return ret;
    }
};