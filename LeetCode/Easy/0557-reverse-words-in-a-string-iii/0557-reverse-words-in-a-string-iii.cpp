class Solution {
public:
    string reverseWords(string s) {
        int j = 0;
        for (int i = 1; i < s.length(); ++i){
            if (s[i] == ' '){
                reverse(s.begin()+j, s.begin()+i);
                j = i + 1;
            }
        }
        reverse(s.begin()+j, s.end());
        return s;
    }
};