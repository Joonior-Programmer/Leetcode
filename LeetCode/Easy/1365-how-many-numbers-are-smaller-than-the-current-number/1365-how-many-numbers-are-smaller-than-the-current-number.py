class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        count = [0] * 101
        curr = 0

        for v in nums:
            count[v] += 1

        for i in range(101):
            temp = count[i]
            count[i] = curr
            curr += temp
        
        for i in range(len(nums)):
            nums[i] = count[nums[i]]

        return nums
