class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        ret = []
        sum_num = 0

        for v in nums:
            sum_num = (sum_num * 2 + v) % 5
            ret.append(sum_num == 0)

        return ret