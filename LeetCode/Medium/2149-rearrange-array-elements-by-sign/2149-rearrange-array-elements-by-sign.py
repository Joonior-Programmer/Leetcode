class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos = []
        neg = []
        ret = []
        
        for num in nums:
            if num < 0:
                neg.append(num)
            else:
                pos.append(num)
        
        i = 0
        
        while i < len(pos):
            ret.append(pos[i])
            ret.append(neg[i])
            i += 1
        
        return ret