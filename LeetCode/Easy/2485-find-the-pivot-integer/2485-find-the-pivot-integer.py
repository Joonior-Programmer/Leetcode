class Solution:
    def pivotInteger(self, n: int) -> int:
        ret = 1
        curr = 1
        curr_n = (n * (n + 1)) // 2
        
        while curr <= curr_n:
            if curr == curr_n:
                return ret
            curr_n -= ret
            ret += 1
            curr += ret
        
        return -1