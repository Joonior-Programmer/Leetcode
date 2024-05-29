class Solution {
public:
    int numSteps(string s) {
        int ret = 0;
        int lead = 0;
        int r = s.size() - 1;

        while (r > 0){
            int temp = s[r] - '0' + lead;
            if (temp == 0) {
                ++ret;
                lead = 0;
            } else if (temp == 2) {
                ++ret;
                lead = 1;
            } else {
                ret += 2;
                lead = 1;
            }

            r--;
        }

        if (lead == 1) ++ret;

        return ret;
    }
};