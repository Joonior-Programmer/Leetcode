class Solution {
public:
    bool detectCapitalUse(string word) {
        bool isLower = false;
        bool isUpper = true;

        if (word[0] > 95 && word[0] < 123){
            isLower = true;
            isUpper = false;
        }
        if (isLower){
            for (int i = 1; i < word.size(); ++i) {
                if (!(word[i] > 95 && word[i] < 123)) return false;
            }
        } else {
            for (int i = 1; i < word.size(); ++i){
                if (i > 1 && !isLower && word[i] > 95 && word[i] < 123) return false;
                else if (isLower && isUpper && !(word[i] > 95 && word[i] < 123)) return false;
                else if (word[i] > 95 && word[i] < 123) isLower = true;
            }
        }
        return true;
    }
};