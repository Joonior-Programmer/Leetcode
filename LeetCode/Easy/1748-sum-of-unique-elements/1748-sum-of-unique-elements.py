class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        count = [0] * 101
        ret = 0
        
        for v in nums:
            count[v] += 1

        for i in range(1, 101):
            if count[i] == 1:
                ret += i

        return ret