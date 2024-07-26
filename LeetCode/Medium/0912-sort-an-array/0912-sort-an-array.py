class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        count = [0] * 100001
        idx = 0
        for v in nums: count[v+50000] += 1

        for i in range(100001):
            for j in range(count[i]):
                nums[idx] = i - 50000 
                idx += 1

        return nums