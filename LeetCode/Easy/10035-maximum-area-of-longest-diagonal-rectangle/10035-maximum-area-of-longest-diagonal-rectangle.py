class Solution:
    def areaOfMaxDiagonal(self, dimensions: List[List[int]]) -> int:
        l, w = 0, 0
        
        for v1, v2 in dimensions:
            original = l * l + w * w
            new = v1 * v1 + v2 * v2

            if new > original or (original == new and l * w < v1 * v2):
                l, w = v1, v2
                
        return l * w