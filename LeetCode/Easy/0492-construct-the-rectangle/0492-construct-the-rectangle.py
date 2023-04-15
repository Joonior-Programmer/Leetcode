class Solution:
    def constructRectangle(self, area: int) -> List[int]:
        W = int(area ** 0.5)
        while area % W != 0:
            W -= 1
        return [area // W, W]