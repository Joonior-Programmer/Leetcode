class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        time = []
        exist = set()
        
        for v in timePoints:
            h, m = v.split(":")
            temp = int(h) * 60 + int(m)

            if temp in exist:
                return 0
            
            time.append(temp)
        
        time.sort()

        ret = 24 * 60 - time[-1] + time[0]

        for i in range(1, len(time)):
            ret = min(ret, time[i] - time[i-1])

        return ret