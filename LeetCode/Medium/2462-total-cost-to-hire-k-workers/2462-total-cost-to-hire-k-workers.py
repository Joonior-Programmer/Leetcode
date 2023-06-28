class Solution:
    def totalCost(self, costs: List[int], k: int, candidates: int) -> int:
        n = len(costs)
        ret = 0
        l = candidates - 1
        r = candidates
        l_pq = []
        r_pq = []
        if n > candidates * 2:
            l_pq = costs[:l + 1]
            r_pq = costs[-r:]
            heapify(l_pq)
            heapify(r_pq)
        else:
            l_pq = costs

        while n > candidates * 2 and k:
            l_val = l_pq[0]
            r_val = r_pq[0]
            if r_val < l_val:
                r += 1
                ret += heapq.heappop(r_pq)
                heapq.heappush(r_pq, costs[-r])
            else:
                l += 1
                ret += heapq.heappop(l_pq)
                heapq.heappush(l_pq, costs[l])
            k -= 1
            n -= 1

        costs = l_pq + r_pq
        heapify(costs)

        while k:
            ret += heapq.heappop(costs)
            k -= 1

        return ret