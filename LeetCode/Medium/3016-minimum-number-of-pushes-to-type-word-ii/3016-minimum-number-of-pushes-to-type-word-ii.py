from queue import PriorityQueue

class Solution:
    def minimumPushes(self, word: str) -> int:
        arr = [0] * 26
        press = defaultdict(int)

        val = 1
        count = 0
        ret = 0

        for v in word:
            arr[ord(v) - 97] += 1

        max_heap = []
        for i in range(26):
            if arr[i]:
                heapq.heappush(max_heap, (-arr[i], chr(97 + i)))

        while max_heap:
            freq, char = heapq.heappop(max_heap)
            press[char] = val
            count += 1

            if count == 8:
                val += 1
                count = 0
        
        for i in range(26):
            ret += press[chr(i + 97)] * arr[i]

        return ret