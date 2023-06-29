class Solution {
public:
    long long totalCost(vector<int>& costs, int k, int candidates) {
        long long ret = 0;
        int n = costs.size();
        
        if (n <= candidates * 2){
            sort(costs.begin(), costs.end());
            for (int i = 0; i < k; ++i) ret += costs[i];
            return ret;
        }

        priority_queue<int, vector<int>, greater<int>> lPQ;
        priority_queue<int, vector<int>, greater<int>> rPQ;
        int l = candidates;
        int r = n - candidates;

        for (int i = 0; i < l; ++i) lPQ.push(costs[i]);
        for (int i = r; i < n; ++i) rPQ.push(costs[i]);

        while (k > 0){
            int lVal = lPQ.top();
            int rVal = rPQ.top();

            if (rVal < lVal){
                ret += (long long)rVal;
                rPQ.pop();
                rPQ.push(costs[--r]);
            } else {
                ret += (long long)lVal;
                lPQ.pop();
                lPQ.push(costs[l++]);
            }
            k--;

            if (l >= r){
                while (!rPQ.empty()) {
                    lPQ.push(rPQ.top());
                    rPQ.pop();
                }
                while (k > 0) {
                    ret += lPQ.top();
                    lPQ.pop();
                    k--;
                }
            }
        }
        return ret;
    }
};