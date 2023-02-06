class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        ret = [0] * (n * 2)
        for i in range(n):
            ret[i*2]= nums[i]
            ret[i*2+1] = nums[i+n]
        return ret
