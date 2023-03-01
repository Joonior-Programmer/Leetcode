class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if not nums:
            return []
        elif len(nums) < 2:
            return [str(nums[0])]
        ret = []
        min = nums[0]
        max = nums[1]
        if min + 1 != max:
            ret.append(str(min))
            min = nums[1]
        for v in nums[2:]:
            if max + 1 == v:
                max = v
            elif min == max:
                ret.append(str(min))
                min = v
                max = v
            else:
                ret.append(f"{min}->{max}")
                min = v
                max = v

        if min == max:
            ret.append(str(min))
        else:
            ret.append(f"{min}->{max}")
            
        return ret
        