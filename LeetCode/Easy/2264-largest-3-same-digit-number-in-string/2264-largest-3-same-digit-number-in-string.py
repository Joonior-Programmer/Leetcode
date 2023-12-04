class Solution:
    def largestGoodInteger(self, num: str) -> str:
        ret = ""

        for i in range(len(num)-2):
            if num[i] == num[i+1] == num[i+2] and (not ret or int(ret) < int(num[i:i+3])):
                ret = num[i:i+3]
        
        return ret