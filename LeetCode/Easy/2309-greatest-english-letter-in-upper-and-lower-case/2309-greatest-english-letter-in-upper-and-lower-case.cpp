class Solution {
public:
    string greatestLetter(string s) {
        vector<bool> lower(26);
        vector<bool> upper(26);
        
        for (char v : s)
            if (v > 96) lower[v-97] = true;
            else upper[v-65] = true;
        
        for (int i = 25; i > -1; i--)
            if (upper[i] && lower[i]) return string(1, 'A' + i);
                
        return "";
    }
};