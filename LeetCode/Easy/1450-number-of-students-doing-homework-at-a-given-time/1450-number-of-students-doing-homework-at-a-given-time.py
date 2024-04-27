class Solution:
    def busyStudent(self, startTime: List[int], endTime: List[int], queryTime: int) -> int:
        ret = 0
        
        for i in range(len(startTime)):
            if startTime[i] <= queryTime <= endTime[i]:
                ret += 1
        
        return ret