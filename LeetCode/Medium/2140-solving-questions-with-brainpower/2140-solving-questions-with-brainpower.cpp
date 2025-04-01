class Solution {
public:
    long long mostPoints(vector<vector<int>>& questions) {
        int n = questions.size();
        vector<long long> dp(n+1);

        for (int i = n - 1; i > -1; i--){
            int point = questions[i][0];
            int bp = questions[i][1];

            dp[i] = max(dp[i+1], dp[min(n, bp + i + 1)] + point);
        }

        return dp[0];
    }
};