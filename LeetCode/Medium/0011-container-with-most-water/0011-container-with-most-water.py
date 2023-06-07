class Solution:
    def maxArea(self, height: List[int]) -> int:
        i, j, ret = 0, len(height) - 1, 0
        while i < j:
            ret = max(ret, (j-i) * min(height[i], height[j]))
            if height[i] > height[j]:
                j -= 1
            else:
                i += 1
        return ret