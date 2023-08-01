class Solution {
public:
    bool judgeCircle(string moves) {
        int x = 0, y = 0;
        
        for (char v : moves){
            if (v == 'U') ++y;
            else if (v == 'D') y--;
            else if (v == 'R') ++x;
            else x--;
        }
        
        return !x && !y;
    }
};