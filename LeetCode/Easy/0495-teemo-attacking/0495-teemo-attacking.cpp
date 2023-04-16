class Solution {
public:
    int findPoisonedDuration(vector<int>& timeSeries, int duration) {
        int maxTime = -999;
        int ret = 0;
        for (int i = 0; i < timeSeries.size(); ++i){
            ret += duration;
            if (maxTime >= timeSeries[i]) ret -= maxTime - timeSeries[i];
            maxTime = timeSeries[i] + duration;
        }
        return ret;
    }
};