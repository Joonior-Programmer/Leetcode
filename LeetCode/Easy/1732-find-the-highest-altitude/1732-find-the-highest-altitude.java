class Solution {
    public int largestAltitude(int[] gain) {
        int cur = 0;
        int ret = 0;
        for (int i = 0; i < gain.length; ++i) {
            cur += gain[i];
            ret = Math.max(ret, cur);
        }
        return ret;
    }
}