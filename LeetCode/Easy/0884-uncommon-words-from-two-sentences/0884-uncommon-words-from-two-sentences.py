class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        count = defaultdict(int)
        s1, s2 = s1.split(), s2.split()
        ret = []
        
        for v in s1:
            count[v] += 1
            
        for v in s2:
            count[v] += 1
        
        for k, v in count.items():
            if v == 1:
                ret.append(k)
                
        return ret