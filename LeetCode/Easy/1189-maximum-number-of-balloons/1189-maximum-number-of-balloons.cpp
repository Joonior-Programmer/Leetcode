class Solution {
public:
    int maxNumberOfBalloons(string text) {
        vector<int> count(26);
        int ret = 99999;
        
        for (int i = 0; i < text.size(); ++i) ++count[text[i]-97];
        
        ret = min(ret, count['b'-97]);
        ret = min(ret, count['a'-97]);
        ret = min(ret, count['l'-97] / 2);
        ret = min(ret, count['o'-97] / 2);
        ret = min(ret, count['n'-97]);
        
        return ret;
    }
};