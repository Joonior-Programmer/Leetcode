class Solution:
    def search(self, nums: List[int], target: int) -> int:
        min_left = nums[0]
        max_right = nums[-1]

        if min_left > target > max_right:
            return -1
        

        l, r = 0, len(nums)-1

        if nums[l] == target:
            return l
        if nums[r] == target:
            return r
        
        if min_left < max_right:
            while l <= r:
                mid = (l + r) // 2

                if nums[mid] == target:
                    return mid
                elif nums[mid] < target:
                    l = mid + 1
                else:
                    r = mid - 1
        else:
            while l <= r:
                mid = (l + r) // 2

                if nums[mid] == target:
                    return mid
                elif nums[mid] >= min_left and target < max_right:
                    l = mid + 1
                elif nums[mid] <= max_right and target > min_left:
                    r = mid - 1
                elif nums[mid] > target:
                    r = mid - 1
                else:
                    l = mid + 1
                
        return -1