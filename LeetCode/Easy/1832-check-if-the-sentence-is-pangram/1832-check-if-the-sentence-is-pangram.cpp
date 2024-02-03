class Solution {
public:
    bool checkIfPangram(string sentence) {
        vector<bool> v(26);
        
        for (char c : sentence) v[c-'a'] = true;
        
        for (int i = 0; i < 26; ++i) 
            if (!v[i]) return false;
        
        return true;
    }
};