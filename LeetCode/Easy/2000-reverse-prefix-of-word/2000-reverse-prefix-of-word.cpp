class Solution {
public:
    string reversePrefix(string word, char ch) {
        int r = 0;
        
        for (int i = 0; i < word.size(); ++i){
            if (word[i] == ch) break;
            ++r;
        }
        
        if (r == word.size()) return word;
        
        vector<char> ret(word.begin(), word.end());
        int l = 0;
        
        while (l < r){
            char temp = ret[l];
            ret[l++] = ret[r];
            ret[r--] = temp;
        }
        
        string result(ret.begin(), ret.end());
        
        return result;
    }
};