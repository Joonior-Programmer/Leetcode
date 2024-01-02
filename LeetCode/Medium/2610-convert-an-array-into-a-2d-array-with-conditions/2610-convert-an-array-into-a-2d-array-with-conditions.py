class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        count = [0] * 201
        ret = []
        
        for num in nums:
            if count[num] == len(ret):
                ret.append([])
            ret[count[num]].append(num)
            count[num] += 1
        
        return ret