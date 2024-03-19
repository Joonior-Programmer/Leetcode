class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int ret = 0;
        
        for (string v : sentences) {
            int temp = 0;
            for (char c : v)
                if (c == ' ') ++temp;
            
            if (ret < temp) ret = temp;
        }

        return ret + 1;
    }
};