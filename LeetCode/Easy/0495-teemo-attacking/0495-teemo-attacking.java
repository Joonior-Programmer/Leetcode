class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int maxTime = -999;
        int ret = 0;
        for (int i = 0; i < timeSeries.length; ++i){
            ret += duration;
            if (maxTime >= timeSeries[i]) ret -= maxTime - timeSeries[i] + 1;
            maxTime = timeSeries[i] + duration - 1;
        }
        return ret;
    }
}