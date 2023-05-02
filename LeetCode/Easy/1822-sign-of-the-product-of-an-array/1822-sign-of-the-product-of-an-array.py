class Solution:
    def arraySign(self, nums: List[int]) -> int:
        ret = 1
        for num in nums:
            ret *= num
            if ret == 0:
                return 0
        return 1 if ret > 0 else -1 if ret < 0 else 0