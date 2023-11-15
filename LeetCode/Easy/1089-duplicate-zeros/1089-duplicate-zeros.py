class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        n = len(arr)
        temp = arr.copy()
        i = 0
        j = 0
        zeros = 0
        
        while j < n:
            while j < n and temp[i] == 0:
                arr[j] = 0
                j += 1
                i += 1
                if j < n:
                    arr[j] = 0
                    j += 1
            
            if j < n:
                arr[j] = temp[i]
            
            j += 1
            i += 1

        
        
            
            