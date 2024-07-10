class Solution:
    def numberOfAlternatingGroups(self, colors: List[int]) -> int:
        ret = 0
        
        for i in range(len(colors) - 1):
            if colors[i] != colors[i-1] and colors[i] != colors[i+1]:
                ret += 1
        
        if colors[0] != colors[-1] and colors[-2] != colors[-1]:
            ret += 1
        
        return ret