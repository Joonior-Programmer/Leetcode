class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ret = set()
        container = set()
        
        for v in nums:
            if v not in container:
                container.add(v)
                ret.add(v)
            else:
                if v in ret:
                    ret.remove(v)
                
        for v in ret:
            return v