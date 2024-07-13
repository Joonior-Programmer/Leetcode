class Solution {
public:
    vector<int> intersection(vector<vector<int>>& nums) {
        vector<int> ret;
        int n = nums.size();
        vector<int> count(1001);

        for (vector<int> num : nums)
            for (int v : num) ++count[v];

        for (int i = 1; i < 1001; ++i)
            if (count[i] == n) ret.push_back(i);   

        return ret;
    }
};