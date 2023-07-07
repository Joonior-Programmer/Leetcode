class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        // int curr = 0;
        // int prev = 0;
        // bool isZeroExist = false;
        // int ret = 0;
        
        // for (int i = 0; i < nums.size(); ++i) {
        //     if (nums[i] == 1) ++curr;
        //     else {
        //         ret = max(ret, curr + prev);
        //         prev = curr;
        //         curr = 0;
        //         isZeroExist = true;
        //     }
        // }
        
        // if (!isZeroExist) return curr - 1;
        
        // return max(ret, prev + curr);

        int i = 0;
        int ret = 0;
        int zeroCount = 0 ;
        for (int j = 0; j < nums.size(); ++j){
            if (nums[j] == 0) ++zeroCount;
            if (zeroCount > 1 && nums[i++] == 0) zeroCount--;
            ret = max(ret, j - i);
        }

        return ret;
    }
};