class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        int count[20001]{0};
        int ret = 0;
        for (int i = 0; i < nums.size(); ++i) ++count[nums[i] + 10000];
        
        for (int i = 20000; i > -1; i--){
            if (count[i] >= k) {
                ret = i - 10000;
                break;
            } else k -= count[i];
        }
        
        return ret;
    }
};