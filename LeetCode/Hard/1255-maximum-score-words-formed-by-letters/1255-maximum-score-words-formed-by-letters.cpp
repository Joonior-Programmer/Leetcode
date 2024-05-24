class Solution {
public:
    int ret = 0;
    int n;
    vector<int> count;
    vector<int> score;
    
    Solution() : count(26, 0) {};
    
    int maxScoreWords(vector<string>& words, vector<char>& letters, vector<int>& score) {
        n = words.size();
        vector<vector<int>> wordsCount(n, vector<int>(26));
        this->score = score;
        
        for (int i = 0; i < letters.size(); ++i) ++count[letters[i] - 'a'];
        
        for (int i = 0; i < n; ++i)
            for (char v : words[i]) ++wordsCount[i][v - 'a'];
        
        dfs(0, 0, wordsCount);
        
        return ret;
    }
    
    void dfs(int idx, int curr, vector<vector<int>>& words){
        if (idx == n) {
            ret = max(ret, curr);
            return;
        } 

        bool possible = true;

        for (int i = 0; i < 26; ++i)
            if (words[idx][i] > count[i]){
                possible = false;
                break;
            }
        

        if (possible){
            int temp = 0;
            for (int i = 0; i < 26; ++i){
                temp += score[i] * words[idx][i];
                count[i] -= words[idx][i];
            }

            dfs(idx + 1, curr + temp, words);

            for (int i = 0; i < 26; ++i)
                count[i] += words[idx][i];

            dfs(idx + 1, curr, words);
        } else dfs(idx + 1, curr, words);
    }
};