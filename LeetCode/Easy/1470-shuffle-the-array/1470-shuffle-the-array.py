class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        front = nums[:n]
        back = nums[n:]
        ret = []
        for i in range(n):
            ret.append(front[i])
            ret.append(back[i])
        return ret
