class Solution:
    def minimumRounds(self, tasks: List[int]) -> int:
        tasks.sort()
        length = len(tasks)
        i = 0
        result = 0
        while i < length:
            j = i + 1
            while j < length and tasks[j] == tasks[i]: j += 1
            if j == i + 1: return -1
            result += (j - i + 2) // 3
            i = j
        return result