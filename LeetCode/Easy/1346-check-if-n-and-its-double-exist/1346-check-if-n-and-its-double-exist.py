class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        count = defaultdict(int)
        
        for v in arr:
            count[v] += 1
        
        for k in count.keys():
            if k != 0 and k * 2 in count:
                return True
            elif k == 0 and count[0] > 1:
                return True
        
        return False