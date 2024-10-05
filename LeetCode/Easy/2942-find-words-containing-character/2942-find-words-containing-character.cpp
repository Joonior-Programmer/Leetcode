class Solution {
public:
    vector<int> findWordsContaining(vector<string>& words, char x) {
        vector<int> ret;
        
        for (int i = 0; i < words.size(); ++i){
            string word = words[i];
            
            for (int j = 0; j < word.size(); ++j)
                if (word[j] == x){
                    ret.push_back(i);
                    break;
                }
        }
        
        return ret;
    }
};