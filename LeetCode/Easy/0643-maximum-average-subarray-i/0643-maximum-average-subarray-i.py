class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        new = [sum(nums[:k])]
        prev = 0
        for i in range(k, len(nums)):
            new.append(new[-1] + nums[i] - nums[prev])
            prev += 1
        return max(new) / k