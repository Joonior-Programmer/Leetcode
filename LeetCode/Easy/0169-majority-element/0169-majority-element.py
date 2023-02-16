class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # temp = Counter(nums)
        # count = 0
        # ret = 0
        # for i, v in temp.items():
        #     if v > count:
        #         count = v
        #         ret = i
        # return ret
        count = 0
        ret = 0
        for i in range(len(nums)):
            if not count:
                ret = nums[i]
                
            if ret == nums[i]:
                count += 1
            else:
                count -= 1
        return ret