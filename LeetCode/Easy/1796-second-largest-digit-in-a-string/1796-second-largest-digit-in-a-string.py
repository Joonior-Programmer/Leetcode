class Solution:
    def secondHighest(self, s: str) -> int:
        first, second = -1, -1
        used = set()

        for v in s:
            if v.isdigit() and v not in used:
                temp = int(v)

                if temp > first:
                    second = first
                    first = temp
                elif temp > second:
                    second = temp

                used.add(v)

        return second