class Solution(object):
    def tribonacci(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 0:
            return 0
        if n < 3:
            return 1
        first = 0
        second = 1
        third = 1
        for i in range(3, n+1):
            temp = first + second + third
            first = second
            second = third
            third = temp
        return third