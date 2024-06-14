class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        ret = 0
        count = [0] * 100001

        for v in nums: count[v] += 1

        for i in range(100000):
            if count[i] > 1:
                temp = count[i] - 1
                ret += temp
                count[i+1] += temp

        if count[100000] > 1:
            temp = count[100000] - 1
            ret += temp * (temp + 1) // 2
        
        return ret