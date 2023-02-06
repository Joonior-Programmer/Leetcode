class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector<int> front(nums.begin(), nums.begin()+n);
        vector<int> back(nums.begin()+n, nums.end());
        vector<int> ret(n*2);
        for(int i = 0; i < n; ++i){
            ret[i*2] = front[i];
            ret[i*2+1] = back[i];
        }
        return ret;
    }
};