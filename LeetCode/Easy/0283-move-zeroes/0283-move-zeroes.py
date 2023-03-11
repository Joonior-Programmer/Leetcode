class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = 0
        num_of_zero = 0
        while i < len(nums) - num_of_zero:
            if nums[i] == 0:
                nums.pop(i)
                nums.append(0)
                num_of_zero += 1
                continue
            i += 1

        return nums