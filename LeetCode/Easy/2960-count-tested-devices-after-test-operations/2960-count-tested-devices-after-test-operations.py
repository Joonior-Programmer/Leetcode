class Solution:
    def countTestedDevices(self, batteryPercentages: List[int]) -> int:
        ret = 0
        
        for v in batteryPercentages:
            if v - ret > 0:
                ret += 1
        
        return ret