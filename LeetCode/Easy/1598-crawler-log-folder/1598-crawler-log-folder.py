class Solution:
    def minOperations(self, logs: List[str]) -> int:
        ret = 0
        
        for log in logs:
            if log[0] == ".":
                if log[1] == ".":
                    ret = max(0, ret - 1)
            else:
                ret += 1
        
        return ret