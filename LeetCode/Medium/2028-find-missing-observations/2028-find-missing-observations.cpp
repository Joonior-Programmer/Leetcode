class Solution {
public:
    vector<int> missingRolls(vector<int>& rolls, int mean, int n) {
        ios::sync_with_stdio(false);
        cin.tie(nullptr);
        cout.tie(nullptr);

        int m = rolls.size();
        int sumCurr = 0;
        
        for (int i = 0; i < m; ++i) sumCurr += rolls[i];
        
        int need = (n + m) * mean - sumCurr;
        double average = (double) need / n;
        
        if (average > 6 || average < 1) return vector<int>(0);
        
        int avg = (int) average;
        vector<int> ret = vector<int>(n);
        int idx = 0;
        
        while (n > 0) {
            ret[idx++] = avg;
            need -= avg;
            n--;
        }
        
        for (int i = 0; i < need; i++) {
            ++ret[i];
        }
        
        return ret;
    }
};