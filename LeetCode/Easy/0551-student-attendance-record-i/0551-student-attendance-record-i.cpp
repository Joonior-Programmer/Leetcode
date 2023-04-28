class Solution {
public:
    bool checkRecord(string s) {
        int A = 0, L = 0;
        for (int i = 0; i < s.length(); ++i){
            if (s[i] == 'L') { if(++L > 2) return false; }
            else if (s[i] == 'A'){
                if(++A > 1) return false;
                L = 0;
            } else L = 0;
        }
        return true;
    }
};