class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        count = [0] * (len(nums) + 1)
        ret = [0, 0]

        for v in nums:
            count[v] += 1
        
        for i in range(1, len(count)):
            if count[i] == 0:
                ret[1] = i
            elif count[i] == 2:
                ret[0] = i

        return ret