class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ret = []
        nums.sort()
        n = len(nums)-1

        for i in range(n-1):
            if i > 0 and nums[i] == nums[i-1]:
                continue
                
            l = i + 1
            r = n

            while l < r:
                temp = nums[l] + nums[r] + nums[i]
                if temp == 0:
                    ret.append([nums[l], nums[r], nums[i]])
                    l += 1
                    r -= 1
                    while l < r and nums[l] == nums[l-1]:
                        l += 1
                    while l < r and nums[r] == nums[r+1]:
                        r -= 1
                elif temp < 0:
                    l += 1
                else:
                    r -= 1

        return ret
                    
                    

