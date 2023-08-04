class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x: x[1])
        ret = 0
        next_idx, left, right = 1, 0, 1

        while right < len(intervals):
            if intervals[left][1] > intervals[right][0]:
                ret += 1
                right += 1
                next_idx = right
            else:
                left = next_idx
                right += 1
                next_idx = right
        
        return ret