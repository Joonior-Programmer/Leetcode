class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        count = 1
        for j in range(1, len(nums)):
            if nums[i] == nums[j]:
                if count < 2:
                    i += 1
                    nums[i] = nums[j]
                count += 1
            else:
                i += 1
                nums[i] = nums[j]
                count = 1

        return i+1
