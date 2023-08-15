class Solution:
    def trap(self, height: List[int]) -> int:
        max_num = 0
        l, r, n = 0, 1, len(height)
        ret = 0
        
        while l < n:
            if height[l] > 0:
                max_num = height[l]
                break
            l += 1
        
        r = l + 1

        while r < n:
            if height[r] >= max_num:
                for i in range(l+1, r):
                    ret += max_num - height[i]
                l = r
                max_num = height[r]
            r += 1
        
        r = n - 1

        while r > l:
            if height[r] > 0:
                max_num = height[r]
                break
            r -= 1

        new_l = r - 1

        while new_l >= l:
            if height[new_l] >= max_num:
                for i in range(new_l + 1, r):
                    ret += max_num - height[i]
                r = new_l
                max_num = height[new_l]
            new_l -= 1

        return ret
        