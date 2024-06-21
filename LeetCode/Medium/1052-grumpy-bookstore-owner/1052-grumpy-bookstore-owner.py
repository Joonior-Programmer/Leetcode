class Solution:
    def maxSatisfied(self, customers: List[int], grumpy: List[int], minutes: int) -> int:
        n = len(customers)
        ret = 0
        unsatisfied = 0
        

        for i in range(minutes):
            if grumpy[i]:
                unsatisfied += customers[i]
            else:
                ret += customers[i]

        for i in range(minutes, n):
            if not grumpy[i]:
                ret += customers[i]
        
        max_val = unsatisfied

        for i in range(minutes, n):
            if grumpy[i-minutes]:
                unsatisfied -= customers[i-minutes]
            if grumpy[i]:
                unsatisfied += customers[i]
            max_val = max(max_val, unsatisfied)

        return ret + max_val