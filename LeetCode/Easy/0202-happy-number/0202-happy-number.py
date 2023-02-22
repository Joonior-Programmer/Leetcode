class Solution:
    def isHappy(self, n: int) -> bool:
        visited = set()
        while n != 1:
            if n in visited:
                return False
            visited.add(n)
            temp = 0
            for v in str(n):
                temp += int(v) ** 2
            n = temp
        return True