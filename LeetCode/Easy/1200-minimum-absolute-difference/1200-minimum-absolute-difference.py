class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        ret = []
        min_val = float("inf")
        
        for i in range(1, len(arr)):
            temp = abs(arr[i] - arr[i-1])
            if temp < min_val:
                min_val = temp
                ret = [[arr[i-1], arr[i]]]
            elif temp == min_val:
                ret.append([arr[i-1], arr[i]])
            
        return ret