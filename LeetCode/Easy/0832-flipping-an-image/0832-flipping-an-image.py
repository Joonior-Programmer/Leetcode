class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        for row in image:
            i, j = 0, len(row) - 1
            
            while i <= j:
                row[i], row[j] = int(not row[j]), int(not row[i])
                i += 1
                j -= 1
        
        return image