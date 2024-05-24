class Solution {
    int n;
    int ret = 0;
    int[] count;
    char[][] words;
    int[] score;
    
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        n = words.length;
        count = new int[26];
        this.words = new char[n][26];
        this.score = score;
        
        for (int i = 0; i < letters.length; ++i) ++count[letters[i] - 'a'];
        
        for (int i = 0; i < n; ++i)
            for (char v : words[i].toCharArray()) ++this.words[i][v - 'a'];
        
        dfs(0, 0);
        
        return ret;
    }
    
    private void dfs(int idx, int curr){
        if (idx == n) {
            ret = Math.max(ret, curr);
            return;
        } 

        boolean possible = true;

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

            dfs(idx + 1, curr + temp);

            for (int i = 0; i < 26; ++i)
                count[i] += words[idx][i];

            dfs(idx + 1, curr);
        } else dfs(idx + 1, curr);
    }
}