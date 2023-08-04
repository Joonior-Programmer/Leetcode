class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (x,y) -> x[1]-y[1]);
        int ret = 0;
        int left = 0, right = 1, nextIdx = 1;
        
        while (right < intervals.length){
            if (intervals[left][1] > intervals[right][0]) ++ret;
            else left = nextIdx;
            
            ++right;
            nextIdx = right;
        }
        return ret;
    }
}