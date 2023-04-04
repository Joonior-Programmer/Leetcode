class Solution {
public:
    int countSegments(string s) {
        bool empty = true;
        int ret = 0;
        for (int i = 0; i < s.size(); ++i){
            if (s[i] == ' ' && !empty){
                ++ret;
                empty = true;
            } else if (s[i] != ' ') empty = false;
        }
        if(!empty) ++ret;
        return ret;
    }
};