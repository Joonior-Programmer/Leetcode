class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        n = len(intervals)
        ret = []
        intervals.sort(key=lambda x: x[0])
        i = 0
        
        while i < n:
            temp = [intervals[i][0], intervals[i][1]]

            i += 1
            while i  < n and temp[1] >= intervals[i][0]:
                temp[1] = max(temp[1], intervals[i][1])
                i += 1

            ret.append(temp)

        return ret