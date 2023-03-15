class NumArray:

    def __init__(self, nums: List[int]):
        self.sum_array = [nums[0]]
        for i in range(1, len(nums)):
            self.sum_array.append(self.sum_array[i-1] + nums[i])

    def sumRange(self, left: int, right: int) -> int:
        ret = self.sum_array[right]
        if left != 0:
            ret -= self.sum_array[left - 1]
        return ret
        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)