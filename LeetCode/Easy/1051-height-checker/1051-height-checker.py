class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        compare = sorted(heights)
        ret = 0
        
        for i in range(len(heights)):
            if compare[i] != heights[i]:
                ret += 1
        
        return ret