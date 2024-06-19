class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        if m * k > len(bloomDay):
            return -1
        
        def check(x):
            bouqets = 0
            curr = 0
            
            for v in bloomDay:
                if v <= x:
                    curr += 1
                else:
                    curr = 0
                
                if curr == k:
                    curr = 0
                    bouqets += 1
                    if bouqets == m:
                        return True
            
            return False
        
        l, r = min(bloomDay), max(bloomDay)
        
        while l < r:
            mid = (l + r) // 2

            if check(mid):
                r = mid
            else:
                l = mid + 1

        return l