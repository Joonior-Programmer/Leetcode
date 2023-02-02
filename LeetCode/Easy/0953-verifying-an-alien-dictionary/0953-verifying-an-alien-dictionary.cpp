class Solution {
public:
    bool isAlienSorted(vector<string>& words, string order) {
        map<char, int> sequence;
        for(int i = 0; i < 26; ++i) sequence.insert(pair(order[i], i));

        for(int i = 0; i < words.size()-1; ++i){
            int nextLength = words[i+1].length() - 1;
            for (int j = 0; j < words[i].length(); ++j){
                if (j > nextLength) return false;
                else if (sequence[words[i][j]] < sequence[words[i+1][j]]) break;
                else if (sequence[words[i][j]] > sequence[words[i+1][j]]) return false;
            }
        }
        return true;
    }
};