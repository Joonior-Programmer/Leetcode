class Solution {
public:
    int countCharacters(vector<string>& words, string chars) {
        vector<int> count(26);
        int ret = 0;
        
        for (char v : chars) ++count[v-'a'];
        
        for (string word : words){
            vector<int> countTemp(26);
            bool condition = true;
            
            for (char v : word){
                int temp = v - 'a';
                ++countTemp[temp];
                if (countTemp[temp] > count[temp]) {
                    condition = false;
                    break;
                }
            }
            
            if (condition) ret += word.size();
        }
        
        return ret;
    }
};