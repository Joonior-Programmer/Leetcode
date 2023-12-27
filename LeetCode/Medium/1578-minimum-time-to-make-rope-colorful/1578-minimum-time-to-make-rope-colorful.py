class Solution:
    def minCost(self, colors: str, neededTime: List[int]) -> int:
        ret = 0
        prev = colors[0]
        prev_time = neededTime[0]

        for i in range(1, len(colors)):
            if colors[i] == prev:
                ret += min(prev_time, neededTime[i])
                prev_time = max(prev_time, neededTime[i])
            else:
                prev = colors[i]
                prev_time = neededTime[i]
                
        return ret