class Solution:
    def averageWaitingTime(self, customers: List[List[int]]) -> float:
        ret = 0
        curr = customers[0][0]
        
        for v0, v1 in customers:
            curr = max(curr, v0) + v1
            ret += curr - v0
            
        return ret / len(customers)