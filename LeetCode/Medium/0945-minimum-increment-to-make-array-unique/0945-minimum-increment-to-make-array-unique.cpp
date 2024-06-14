class Solution {
public:
    int minIncrementForUnique(vector<int>& nums) {
        int ret = 0;
        vector<int> count(100001);

        for (int v : nums) { ++count[v]; }

        for (int i = 0; i < 100000; i++) {
            if (count[i] > 1) {
                int temp = count[i] - 1;
                ret += temp;
                count[i+1] += temp;
            }
        }

        if (count[100000] > 1) {
            int temp = count[100000] - 1;
            ret += temp * (temp + 1) / 2;
        }

        return ret;
    }
};