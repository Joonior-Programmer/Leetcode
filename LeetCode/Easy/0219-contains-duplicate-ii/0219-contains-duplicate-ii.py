class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        find = defaultdict(list)
        for i in range(len(nums)):
            if find[nums[i]] and i - find[nums[i]][-1] <= k:
                return True
            find[nums[i]].append(i)
        return False