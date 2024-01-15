class Solution:
    def findWinners(self, matches: List[List[int]]) -> List[List[int]]:
        count = defaultdict(int)
        ret = [[], []]
        
        for v1, v2 in matches:
            count[v1] += 0
            count[v2] += 1
        
        for k, v in count.items():
            if v == 0:
                ret[0].append(k)
            elif v == 1:
                ret[1].append(k)
        
        ret[0].sort()
        ret[1].sort()
        
        return ret