class Solution:
    def rob(self, nums: List[int]) -> int:
        curr1, curr2 = 0,0

        for v in nums:
            temp = max(curr1 + v, curr2)
            curr1 = curr2
            curr2 = temp

        return max(curr1, curr2)