class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
      n = len(s)
      ret = [9998] * n

      val = 9999
      
      for i in range(n):
        if s[i] == c:
          ret[i] = 0
          val = 1
        else:
          ret[i] = val
          val += 1
      
      val = 9999

      for i in range(n - 1, -1, -1):
        if s[i] == c:
          ret[i] = 0
          val = 1
        else:
          ret[i] = min(val, ret[i])
          val += 1

      return ret