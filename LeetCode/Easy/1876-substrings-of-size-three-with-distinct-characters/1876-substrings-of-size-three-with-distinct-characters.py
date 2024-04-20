class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        if len(s) < 3:
            return 0
        
        dq = deque()
        count = [0] * 26
        ret = 0
        
        i = 0
        
        while i < len(s):
            temp = ord(s[i]) - 97

            while dq and count[temp]:
                count[dq[0]] -= 1
                dq.popleft()
            
            count[temp] += 1
            dq.append(temp)

            if len(dq) == 3:
                ret += 1
                count[dq.popleft()] -= 1
                
            i += 1
            
        return ret