class Solution {
public:
    vector<string> findWords(vector<string>& words) {
        int keyboard[26]{1,0,0,1,2,1,1,1,2,1,1,1,0,0,2,2,2,2,1,2,2,0,2,0,2,0};
        vector<string> ret;
        int first; 
        int second;
        int third;
        for (int i = 0; i < words.size(); ++i){
            first = 0;
            second = 0;
            third = 0;

            for (int j = 0; j < words[i].size(); ++j){
                if (keyboard[toupper(words[i][j]) - 'A'] == 0) ++first;
                else break;
            }

            if (first == words[i].size()) {
                ret.push_back(words[i]);
                continue;
            }

            for (int j = 0; j < words[i].size(); ++j){
                if (keyboard[toupper(words[i][j]) - 'A'] == 1) ++second;
                else break;
            }

            if (second == words[i].size()) {
                ret.push_back(words[i]);
                continue;
            }

            for (int j = 0; j < words[i].size(); ++j){
                if (keyboard[toupper(words[i][j]) - 'A'] == 2) ++third;
                else break;
            }

            if (third == words[i].size()) {
                ret.push_back(words[i]);
            }
        }
        return ret;
    }
};