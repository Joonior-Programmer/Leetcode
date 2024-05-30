class Solution:
    def countTriplets(self, arr: List[int]) -> int:
        n = len(arr)
        ret = 0

        for i in range(n):
            temp = arr[i]
            for j in range(i+1, n):
                temp ^= arr[j]
                
                if not temp:
                    ret += j - i

        return ret