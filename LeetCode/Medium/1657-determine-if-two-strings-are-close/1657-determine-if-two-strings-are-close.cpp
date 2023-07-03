class Solution {
public:
    bool closeStrings(string word1, string word2) {
        int counts1[26]{0};
        int counts2[26]{0};
        
        for (int i = 0; i < word1.size(); ++i) ++counts1[word1[i] - 'a'];
        for (int i = 0; i < word2.size(); ++i) ++counts2[word2[i] - 'a'];
        
        for (int i = 0; i < 26; ++i) if (counts1[i] > 0 && counts2[i] == 0 || counts2[i] > 0 && counts1[i] == 0) return false;
        
        sort(counts1, counts1+26);
        sort(counts2, counts2+26);
        
        for (int i = 0; i < 26; ++i) if (counts1[i] != counts2[i]) return false;
        
        return true;
    }
};