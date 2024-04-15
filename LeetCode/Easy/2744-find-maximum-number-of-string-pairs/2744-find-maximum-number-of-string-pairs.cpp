class Solution {
public:
    int maximumNumberOfStringPairs(vector<string>& words) {
        vector<vector<bool>> count(26, vector<bool>(26));
        int ret = 0;
        
        for (string word : words){
            int a = word[0] - 'a';
            int b = word[1] - 'a';
            
            if (count[a][b]) ++ret;
            
            count[a][b] = true;
            count[b][a] = true;
        }
        
        return ret;
    }
};