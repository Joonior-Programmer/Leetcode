class Solution {
public:
    long long maxKelements(vector<int>& nums, int k) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        cout.tie(NULL);
        
        priority_queue<int> maxHeap(nums.begin(), nums.end());
        
        long ret = 0;

        for (int i = 0; i < k; i++) {
            int maxValue = maxHeap.top();
            maxHeap.pop();
            ret += maxValue;
            maxHeap.push((maxValue + 2) / 3);
        }

        return ret;
    }
};