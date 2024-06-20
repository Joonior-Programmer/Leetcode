class Solution:
    def maxDistance(self, position: List[int], m: int) -> int:
        position.sort()

        def check(x):
            curr, start = 1, position[0]

            for i in range(1, len(position)):
                if position[i] - start >= x:
                    start = position[i]
                    curr += 1
            
            return curr

        l, r = 1, (position[-1] - position[0]) // (m - 1)

        while l <= r:
            mid = (l + r) // 2
            if check(mid) >= m:
                l = mid + 1
            else:
                r = mid - 1

        return r