class Solution {
public:
    int minGroups(vector<vector<int>>& intervals) {
        ios::sync_with_stdio(false);
        cin.tie(nullptr);
        cout.tie(nullptr);
        
        priority_queue<int, vector<int>, greater<int>> pq;
        
        sort(intervals.begin(), intervals.end(), [](const vector<int>& a, const vector<int>& b) {
            return a[0] < b[0];
        });

        for (const auto& v : intervals) {
            if (!pq.empty() && pq.top() < v[0]) {
                pq.pop();
            }
            pq.push(v[1]);
        }

        return pq.size();
    }
};