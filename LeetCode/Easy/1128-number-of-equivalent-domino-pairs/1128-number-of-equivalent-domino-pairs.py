class Solution:
    def numEquivDominoPairs(self, dominoes: List[List[int]]) -> int:
        ret = 0
        count = defaultdict(int)
        
        for v in dominoes:
            count[tuple(sorted(v))] += 1
        
        for v in count.values():
            ret += v * ((v-1) / 2)
        
        return int(ret)