class Solution:
    def convert(self, s: str, numRows: int) -> str:
        n = len(s)
        
        if numRows == 1 or n <= numRows:
            return s
        
        ret = [""] * n
        cycle = numRows * 2 - 2
        idx = 0
        
        for i in range(numRows):
            j = 0
            
            while j + i < n:
                ret[idx] = s[i+j]
                idx += 1
                
                if i != 0 and i != numRows - 1 and j + cycle - i < n:
                    ret[idx] = s[j+cycle-i]
                    idx += 1
                j += cycle
    
        return "".join(ret)
