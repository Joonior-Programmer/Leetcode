class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        find = defaultdict(int)
        for i in range(len(nums)):
            if find[nums[i]] and i + 1 - find[nums[i]] <= k:
                return True
            find[nums[i]] = i + 1
        return False