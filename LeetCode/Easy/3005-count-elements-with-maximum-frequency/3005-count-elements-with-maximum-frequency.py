class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        count = [0] * 101
        max_num = 0
        ret = 0

        for i in range(len(nums)):
            count[nums[i]] += 1

        for i in range(1, 101):
            if count[i] > max_num:
                max_num = count[i]
                ret = max_num
            elif count[i] == max_num:
                ret += max_num

        return ret