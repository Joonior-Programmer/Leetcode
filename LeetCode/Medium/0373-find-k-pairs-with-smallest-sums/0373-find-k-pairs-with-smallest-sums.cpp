class Solution {
public:
    vector<vector<int>> kSmallestPairs(vector<int>& nums1, vector<int>& nums2, int k) {
        auto compare = [&nums1, &nums2](const pair<int, int>& a, const pair<int, int>& b) {
            return nums1[a.first] + nums2[a.second] > nums1[b.first] + nums2[b.second];
        };

        priority_queue<pair<int, int>, vector<pair<int, int>>, decltype(compare)> pq(compare);

        vector<vector<int>> ret;

        for (int i = 0; i < k && i < nums1.size(); ++i) pq.push({i, 0});
        
        while (k > 0 && !pq.empty()){
            pair<int, int> target = pq.top();
            pq.pop();

            int i = target.first;
            int j = target.second;

            ret.push_back(vector<int>{nums1[i], nums2[j]});
            
            if (j + 1 < nums2.size())
                pq.push({i, j+1});
            

            k--;
        }

        return ret;
    }
};