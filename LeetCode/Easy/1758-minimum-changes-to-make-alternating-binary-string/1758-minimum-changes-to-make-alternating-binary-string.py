class Solution:
    def minOperations(self, s: str) -> int:
        is_one = True
        ret = float("inf")
        temp = 0
        
        for v in s:
            if is_one and v == "1":
                temp += 1
            elif not is_one and v == "0":
                temp += 1
            is_one = not is_one
        
        ret = min(ret, temp)
        
        is_one = False
        temp = 0
        
        for v in s:
            if is_one and v == "1":
                temp += 1
            elif not is_one and v == "0":
                temp += 1
            is_one = not is_one
        
        ret = min(ret, temp)
        
        return ret
            