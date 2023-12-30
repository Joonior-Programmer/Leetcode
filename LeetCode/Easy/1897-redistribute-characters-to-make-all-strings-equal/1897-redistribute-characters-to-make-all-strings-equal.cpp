class Solution {
public:
    bool makeEqual(vector<string>& words) {
        vector<int> count(26);
        int n = words.size();
        
        for (string word : words)
            for (int i = 0; i < word.size(); ++i) ++count[word[i]-97];
        
        for (int i = 0; i < 26; ++i) 
            if (count[i] % n != 0) return false;
        
        return true;
    }
};