class Solution:
    def minGroups(self, intervals: List[List[int]]) -> int:
        ret = 0
        hq = []

        intervals.sort(key=lambda x : x[0])

        for v0, v1 in intervals:
            if hq and hq[0] < v0:
                heappop(hq)
            heappush(hq, v1)

        return len(hq)