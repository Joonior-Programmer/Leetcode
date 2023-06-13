class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        i = len(asteroids) - 1
        while i > 0:
            left, right = asteroids[i-1], asteroids[i]
            if right < 0 and left > 0:
                if left > -right:
                    asteroids = asteroids[:i] + asteroids[i+1:]
                elif left == -right:
                    asteroids = asteroids[:i-1] + asteroids[i+1:]
                else:
                    asteroids = asteroids[:i-1] + asteroids[i:]
                i = len(asteroids) - 1
            else:
                i -= 1
        return asteroids