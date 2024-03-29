class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int a1 = 0;
        int a2 = 0;

        for (int v : nums) {
            a1 += v;
            while (v > 0) {
                a2 += v % 10;
                v /= 10;
            }
        }

        return a1 - a2;
    }
};