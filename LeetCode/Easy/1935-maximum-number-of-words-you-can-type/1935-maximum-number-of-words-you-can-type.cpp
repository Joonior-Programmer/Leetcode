class Solution {
public:
    int canBeTypedWords(string text, string brokenLetters) {
        int ret = 0;
        vector<bool> broken(26);
        int i = 0;
        int n = text.size();
        bool isGood = true;
        
        for (int i = 0; i < brokenLetters.size(); ++i)
            broken[brokenLetters[i] - 97] = true;
        
        while (i < n){
            ++ret;
            while(i < n && text[i] != ' ' && !broken[text[i]-'a']) ++i;
            

            if (i == n) break;

            if (text[i] != ' ') ret--;
            while(i < n && text[i] != ' ') ++i;
            ++i;
        }
        
        return ret;
    }
};