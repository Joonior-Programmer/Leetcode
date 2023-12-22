class Solution {
public:
    int maxScore(string s) {
        int ret = 0;
        vector<int> count(s.size());
        count[0] = s[0] == '0';
        int temp = count[0] == 0;

        for (int i = 1; i < s.size(); ++i) {
            int v = s[i] == '0';
            count[i] = count[i-1] + v;
            temp += v != 1;
        }

        for (int i = 1; i < s.size(); ++i) 
            ret = max(ret, 2 * count[i-1] + temp - i);
        
        return ret;
    }
};