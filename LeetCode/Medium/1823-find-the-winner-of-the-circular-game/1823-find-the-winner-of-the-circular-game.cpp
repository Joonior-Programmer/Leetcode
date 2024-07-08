class Solution {
public:
    int findTheWinner(int n, int k) {
        vector<int> players(n);
        int i = 0;
        k--;
        int turn = k;
        int ret = 0;
        
        for (int j = 0; j < n - 1; ++j){
            while (turn > 0) {
                if (i == n) i -= n;

                if (players[i]) ++i;
                else {
                    turn--;
                    ++i;
                }                
            }

            if (i >= n) i = 0;
            while (players[i]) {
                ++i;
                if (i == n) i = 0;
            }

            players[i++] = true;
            turn = k;
        }
        
        for (int j = 0; j < n; ++j)
            if (!players[j]) {
                ret = j + 1;
                break;
            }
        
        return ret;
    }
};