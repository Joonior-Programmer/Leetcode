class Solution {
public:
    vector<int> sortJumbled(vector<int>& mapping, vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> order(n, vector<int>(2));
        vector<int> ret(n);

        for (int i = 0; i < n; ++i) {
            order[i][1] = i;
        }

        for (int i = 0; i < n; ++i) {
            int temp = nums[i];
            int place = 1;
            int val = 0;

            if (temp == 0) {
                val = mapping[0];
            }

            while (temp > 0) {
                val = mapping[temp % 10] * place + val;
                place *= 10;
                temp /= 10;
            }

            order[i][0] = val;
        }

        sort(order.begin(), order.end(), [](const vector<int>& a, const vector<int>& b) {
            if (a[0] != b[0]) {
                return a[0] < b[0];
            } else {
                return a[1] < b[1];
            }
        });

        for (int i = 0; i < n; ++i) {
            ret[i] = nums[order[i][1]];
        }

        return ret;
    }
};