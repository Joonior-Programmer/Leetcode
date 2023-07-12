class Solution {
public:
    string predictPartyVictory(string senate) {
        queue<char> turn;
        int r = 0;
        int d = 0;
        int rSkip = 0;
        int dSkip = 0;

        for (int i = 0; i < senate.size(); ++i){
            if (senate[i] == 'R') ++r;
            else ++d;
            turn.push(senate[i]);
        }

        while (r && d){
            char temp = turn.front();
            turn.pop();

            if (temp == 'R'){
                if (rSkip) {
                    rSkip--;
                    continue;
                }
                d--;
                ++dSkip;
            } else {
                if (dSkip) {
                    dSkip--;
                    continue;
                }
                r--;
                ++rSkip;
            }

            turn.push(temp);
        }

        return r ? "Radiant" : "Dire";
    }
};