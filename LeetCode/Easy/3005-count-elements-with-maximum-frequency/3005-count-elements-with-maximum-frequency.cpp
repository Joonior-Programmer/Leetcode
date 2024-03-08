class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        vector<int> count(101);
        int max = 0;
        int ret = 0;

        for (int i = 0; i < nums.size(); i++) { count[nums[i]]++; }

        for (int i = 1; i < 101; i++) {
            if (count[i] > max) {
                max = count[i];
                ret = max;
            } else if (count[i] == max) {
                ret += max;
            }
        }

        return ret;
    }
};