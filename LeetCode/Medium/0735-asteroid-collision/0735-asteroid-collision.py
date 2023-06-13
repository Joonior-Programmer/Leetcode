class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        ret = []
        for v in asteroids:
            while ret and v < 0 < ret[-1]:
                if ret[-1] < -v:
                    ret.pop()
                    continue
                elif ret[-1] == -v:
                    ret.pop()
                break
            else:
                ret.append(v)
        
        return ret