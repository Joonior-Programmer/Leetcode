class Solution:
    def minWindow(self, s: str, t: str) -> str:
        count = Counter(t)
    
        n = len(s)
        m = len(t)

        l, r = 0, m
        curr_count = Counter(s[0:m])

        while True:
            condition = True
            for k, v in count.items():
                if curr_count[k] < v:
                    if r >= n:
                        return ""
                    condition = False
                    curr_count[s[r]] += 1
                    r += 1
                    
                    break
            if condition:
                break
        
        ret = s[l:r]

        while r <= n:
            condition = True
            for k, v in count.items():
                if curr_count[k] < v:
                    condition = False
                    break

            if condition:
                while curr_count[s[l]] > count[s[l]]:
                    curr_count[s[l]] -= 1
                    l += 1

                if r - l < len(ret):
                    ret = s[l:r]
            
            if r >= n:
                break

            curr_count[s[l]] -= 1
            l += 1
            curr_count[s[r]] += 1
            r += 1

        return ret