class Solution:
    def numTilings(self, n: int) -> int:
      sum_tile = [1, 3, 8, 19, 43]
      ret_tile = [1, 2, 5, 11, 24]
      i = 0
      j = 4

      while j < n:
        ret_tile.append((sum_tile[j] + ret_tile[j-1] - sum_tile[i]) % (10 ** 9 + 7))
        sum_tile.append((sum_tile[j] + ret_tile[j+1]) % (10 ** 9 + 7))
        i += 1
        j += 1
      
      return ret_tile[n-1]