class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        int i = 0;
        int len = nums.size();
        vector<string> ret;
        while(i < len){
            int low = i;
            int high = i;

            while(high + 1 < len && nums[high]+1 == nums[high+1]){
                ++high;
            }
            
            if (low == high) ret.push_back(to_string(nums[low]));
            else ret.push_back(to_string(nums[low]) + "->" + to_string(nums[high]));

            i = high + 1;
        }
        return ret;
    }
};