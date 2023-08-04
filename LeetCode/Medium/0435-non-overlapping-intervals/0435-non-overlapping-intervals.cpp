class Solution {
public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), [](vector<int> &first, vector<int> &second) -> bool        {
            return first[1] < second[1];
        });
        int ret = 0;
        int left = 0, right = 1, nextIdx = 1;

        while (right < intervals.size()){
            if (intervals[left][1] > intervals[right][0]) ++ret;
            else left = nextIdx;
            
            ++right;
            nextIdx = right;
        }
        
        return ret;
    }
};