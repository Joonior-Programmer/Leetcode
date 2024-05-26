class Solution {
public:
    vector<int> getNoZeroIntegers(int n) {
        int ret = 0;
        
        for (int i = 1; i < n / 2 + 1; ++i) {
            int temp = i;

            while (temp > 0) {
                if (temp % 10 == 0) break;
                
                temp /= 10;
            }

            if (temp != 0) continue;

            temp = n - i;

            while (temp > 0) {
                if (temp % 10 == 0) break;
                
                temp /= 10;
            }

            if (temp == 0) { 
                ret = i;
                break;
            }
        }

        return vector<int>{ret, n - ret};
    }
};