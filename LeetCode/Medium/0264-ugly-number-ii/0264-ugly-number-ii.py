class Solution:
    def nthUglyNumber(self, n: int) -> int:
        pq = [1]
        used = set()
        ret = 1

        for i in range(n):
            ret = heappop(pq)
            
            if ret * 2 not in used:
                heappush(pq, ret * 2)
                used.add(ret * 2)

            if ret * 3 not in used:
                heappush(pq, ret * 3)
                used.add(ret * 3)
            
            if ret * 5 not in used:
                heappush(pq, ret * 5)
                used.add(ret * 5)
        
        return ret