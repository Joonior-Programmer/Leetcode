class Solution:
    def countLargestGroup(self, n: int) -> int:
        ret = 0
        max_num = 0
        count = [0] * 37

        for i in range(1, n+1):
            curr = i
            temp = 0
            
            while curr:
                temp += curr % 10
                curr //= 10

            count[temp] += 1

        for i in range(1, 36):
            if max_num < count[i]:
                max_num = count[i]
                ret = 1
            elif max_num == count[i]:
                ret += 1

        return ret