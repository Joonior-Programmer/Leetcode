class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        
        ret = [[0] * n for i in range(n)]
        cur = 1
        left, right, top, bottom = 0, n, 0, n
        while cur <= n ** 2:
            for i in range(left, right):
                ret[top][i] = cur
                cur += 1
            top += 1

            for i in range(top, bottom):
                ret[i][right-1] = cur
                cur += 1
            right -= 1

            for i in range(right-1, left-1, -1):
                ret[bottom-1][i] = cur
                cur += 1
            bottom -= 1

            for i in range(bottom-1, top-1, -1):
                ret[i][left] = cur
                cur += 1
            left += 1

        return ret