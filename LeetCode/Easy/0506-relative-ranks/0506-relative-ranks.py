class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        ret = []
        sorted_score = sorted(score)
        ranks = {}
        i = 1
        for v in sorted_score[::-1]:
            ranks[v] = "Gold Medal" if i == 1 else \
                        "Silver Medal" if i == 2 else \
                        "Bronze Medal" if i == 3 else \
                        str(i)
            i += 1
        
        for v in score:
            ret.append(ranks[v])
            
        return ret