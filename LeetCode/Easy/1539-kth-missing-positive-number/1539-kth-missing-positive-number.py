class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        i = 0
        min_num = 1
        for v in arr:
            if v != min_num:
                if v - min_num >= k - i:
                    return min_num + k - i - 1
                else:
                    i = i + v - min_num
                    min_num = v + 1
            else:
                min_num += 1
        return min_num + k - i - 1