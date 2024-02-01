class Solution:
    def divideArray(self, nums: List[int], k: int) -> List[List[int]]:
        prev = 0
        count = [0] * 100001
        ret = []
        j = 1
        
        for v in nums:
            count[v] += 1
        
        for i in range(0, len(nums) // 3):
            temp = []
            
            while not count[j]:
                j += 1
            
            prev = j

            while len(temp) < 3:
                if j - prev > k:
                    return []
                if count[j]:
                    temp.append(j)
                    count[j] -= 1
                else:
                    j += 1
                    
            ret.append(temp)
            
        return ret
            