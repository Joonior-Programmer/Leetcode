class Solution {
public:
    int n = 0;
    int ret = 0;
    int beautifulSubsets(vector<int>& nums, int k) {
        n = nums.size();
        vector<int> count(1001);

        dfs(0, count, nums, k);

        return ret;
    }
    
    void dfs(int idx, vector<int>& count, vector<int>& nums, int k){
        if (idx == n) return;

        int temp = nums[idx];

        if ((temp - k < 0 || count[temp - k] == 0) && (
            temp + k > 1000 || count[temp + k] == 0)){
            ++ret;
            ++count[temp];

            dfs(idx + 1, count, nums,k );
            count[temp]--;
            dfs(idx + 1, count, nums, k);
        } else dfs(idx + 1, count, nums, k);
    }
};