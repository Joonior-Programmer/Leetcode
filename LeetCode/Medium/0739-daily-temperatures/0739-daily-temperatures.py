class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = []
        ret = [0] * len(temperatures)
        for j in range(len(temperatures)):
            while stack:
                if temperatures[stack[-1]] < temperatures[j]:
                    i = stack.pop()
                    ret[i] = j - i
                else:
                    break
            stack.append(j)
        return ret