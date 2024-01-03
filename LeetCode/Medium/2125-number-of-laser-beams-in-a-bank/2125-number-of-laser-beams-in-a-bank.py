class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        ret = 0
        prev = 0
        
        for row in bank:
            temp = row.count("1")
            if temp:
                ret += prev * temp
                prev = temp
                
        return ret