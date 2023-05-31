class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        int first = INT_MAX;
        int second = INT_MAX;
        int temp;
        for (int i = 0; i < nums.size(); ++i){
            temp = nums[i];
            if (first >= temp) first = temp;
            else if (second >= temp) second = temp;
            else return true;
        }
        return false;
    }
};