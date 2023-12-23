class Solution:
    def isPathCrossing(self, path: str) -> bool:
        visited = set([(0, 0)])
        location = { "N":(0, 1), "S": (0, -1), "E":(1, 0), "W":(-1, 0) }
        x, y = 0, 0
        
        for v in path:
            direction = location[v]
            x += direction[0]
            y += direction[1]
            
            if (x, y) in visited:
                return True
            
            visited.add((x, y))
        
        return False