class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        if not intervals:
            return [newInterval]
        
        isMerged = False
        for i in range(len(intervals)):
            if newInterval[0] <= intervals[i][0]:
                intervals = intervals[:i] + [newInterval] + intervals[i:]
                isMerged = True
                break
        
        if not isMerged:
            intervals.append(newInterval)

        result = []
        i = 0
        while i < len(intervals):
            temp = intervals[i]
            j = i + 1
            while j < len(intervals):
                if temp[1] >= intervals[j][0]:
                    temp[0] = min(temp[0], intervals[j][0])
                    temp[1] = max(temp[1], intervals[j][1])
                    i = j
                else:
                    break
                j += 1
            result.append(temp)
            i += 1
        return result