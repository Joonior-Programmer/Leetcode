class Solution:
    def countSeniors(self, details: List[str]) -> int:
        ret = 0
        
        for v in details:
            if int(v[11:13]) > 60:
                ret += 1
            
        return ret