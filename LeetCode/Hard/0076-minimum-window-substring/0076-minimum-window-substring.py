class Solution:
    def minWindow(self, s: str, t: str) -> str:
        count = Counter(t)
        need_count = len(t)
    
        start, end = 0, float("inf")
        l = 0

        for r, v in enumerate(s):
            if count[v] > 0:
                need_count -= 1
            
            count[v] -= 1

            if need_count == 0:
                while count[s[l]] != 0:
                    count[s[l]] += 1
                    l += 1
                if r - l < end - start:
                    start = l
                    end = r

                need_count += 1
                count[s[l]] += 1
                l += 1

        return "" if end > len(s) else s[start:end+1]