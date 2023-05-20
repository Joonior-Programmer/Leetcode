class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int cur = 0;
        int ret = 0;
        for (int i = 0; i < gain.size(); ++i) {
            cur += gain[i];
            ret = max(ret, cur);
        }
        return ret;
    }
};