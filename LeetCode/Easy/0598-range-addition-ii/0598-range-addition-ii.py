class Solution:
    def maxCount(self, m: int, n: int, ops: List[List[int]]) -> int:
        x_min = m
        y_min = n
        
        for add in ops:
            if add[0] < x_min:
                x_min = add[0]
            if add[1] < y_min:
                y_min = add[1]

        return x_min * y_min