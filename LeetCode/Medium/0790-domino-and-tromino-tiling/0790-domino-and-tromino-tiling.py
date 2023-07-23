class Solution:
    def numTilings(self, n: int) -> int:
      ret = [0] * max(3, n)
      ret[0] = 1
      ret[1] = 2
      ret[2] = 5

      for i in range(3, n):
          ret[i] = (ret[i-1] * 2 + ret[i-3]) % 1000000007

      return ret[n-1]