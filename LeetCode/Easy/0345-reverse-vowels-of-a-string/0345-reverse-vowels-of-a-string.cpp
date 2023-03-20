class Solution {
public:
    string reverseVowels(string s) {
        unordered_set<char> vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int i = 0;
        int j = s.length() - 1;
        vector<char> ret(s.begin(), s.end());

        
        while (i < j){
            while (i < j && vowel.find(s[i]) == vowel.end()) {
                ret[i] = s[i];
                ++i;
            }
            while (i < j && vowel.find(s[j]) == vowel.end()) {
                ret[j] = s[j];
                --j;
            }
            if (i < j) {
                ret[i] = s[j];
                ret[j] = s[i];
                ++i;
                j--;
            }
        }

        string result(ret.begin(), ret.end());
        return result;
    }
};