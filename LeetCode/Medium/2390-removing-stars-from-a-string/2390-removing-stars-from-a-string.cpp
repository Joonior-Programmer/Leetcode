class Solution {
public:
    string removeStars(string s) {
        int i = s.find('*');
        if (!i) return s;
        
        char ret[s.size() + 1];
        strcpy(ret, s.c_str());
        
        for (int j = i; j < s.size(); ++j){
            if (s[j] != '*') ret[i++] = s[j];
            else if (i > 0) i--;
        }
        return string(ret, 0, i);
    }
};