class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int ret = 0;
        
        for (int v : batteryPercentages)
            if (v - ret > 0) ++ret;
        
        return ret;
    }
}