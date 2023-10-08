class Solution:
    def totalNQueens(self, n: int) -> int:
      col = set()
      l_diag = set()
      r_diag = set()

      def dfs(row):
        ret = 0

        for i in range(n):
          l = i + row
          r = i - row

          if i not in col and l not in l_diag and r not in r_diag:
            if row == n - 1:
              return 1
            col.add(i)
            l_diag.add(l)
            r_diag.add(r)
            ret += dfs(row+1)
            col.remove(i)
            l_diag.remove(l)
            r_diag.remove(r)
            
        return ret

      return dfs(0)