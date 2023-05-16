class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        stringstream ss;
        
        int i = 0;
        int j = 0;
        
        while (i < word1.size() && j < word2.size()) ss << word1[i++] << word2[j++];
        
        if (i < word1.size()) ss << word1.substr(i, word1.size());
        else if (j < word2.size()) ss << word2.substr(j, word2.size());
        
        return ss.str();
    }
};