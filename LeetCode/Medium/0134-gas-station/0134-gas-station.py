class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        if sum(gas) < sum(cost):
            return -1
        
        result, added = 0 , 0
        for i in range(len(gas)):
            added += gas[i] - cost[i]
            if added < 0:
                added = 0
                result = i + 1
        return result