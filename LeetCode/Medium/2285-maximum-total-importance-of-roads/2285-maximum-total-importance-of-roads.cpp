class Solution {
public:
    long long maximumImportance(int n, vector<vector<int>>& roads) {
        ios::sync_with_stdio(false);
        cin.tie(nullptr);
        cout.tie(nullptr);

        vector<int> count(n);
        vector<int> order(n+1);
        long long ret = 0;
        int idx = n;
        long long val = n;
        
        for (vector<int> v : roads){
            ++count[v[0]];
            ++count[v[1]];
        }
        
        for (int v : count) order[v]++;
        
        while (idx > 0){
            while (idx > 0 && order[idx] < 1) idx--;
            if (idx == 0) break;
            order[idx]--;
            ret += idx * val--;
        }
        
        return ret;
    }
};