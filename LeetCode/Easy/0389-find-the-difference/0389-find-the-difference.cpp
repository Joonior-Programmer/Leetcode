class Solution {
public:
    char findTheDifference(string s, string t) {
        int counter[26]{0};
        char ret = 'a';
        for (int i = 0; i < s.size(); ++i){
            ++counter[s[i] - 'a'];
        }
        for (int i = 0; i < t.size(); ++i){
            counter[t[i]-'a']--;
        }
        for(int i = 0; i < 26; ++i){
            if (counter[i] != 0) {
                ret = i + 'a';
                break;
            }
        }
        return ret;
    }
};