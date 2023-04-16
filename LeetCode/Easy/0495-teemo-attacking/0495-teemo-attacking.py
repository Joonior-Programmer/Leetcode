class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        maxTime = float("-inf")
        ret = 0
        for time in timeSeries:
            ret += duration
            if maxTime >= time:
                ret -= maxTime - time + 1
            maxTime = time + duration - 1

        return ret