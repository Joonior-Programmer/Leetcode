class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> count(n+1);
        ++count[0];
        int curr = 0;
        int ret = 0;

        for (int v : nums){
            if (v % 2 == 1) ++curr;
            if (curr >= k) ret += count[curr-k];
            ++count[curr];
        }

        return ret;
    }
};