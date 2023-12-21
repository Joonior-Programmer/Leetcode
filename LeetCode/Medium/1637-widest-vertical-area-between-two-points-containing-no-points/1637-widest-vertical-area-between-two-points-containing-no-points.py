class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        x = []

        for point in points:
            heappush(x, point[0])
        
        prev = heappop(x)
        curr = heappop(x)

        ret = curr - prev

        while x:
            prev = curr
            curr = heappop(x)
            ret = max(ret, curr - prev)
            
        return ret