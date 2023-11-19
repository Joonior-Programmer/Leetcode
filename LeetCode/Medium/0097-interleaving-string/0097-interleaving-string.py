class Solution:
    def isInterleave(self, s1: str, s2: str, s3: str) -> bool:
        if len(s1) + len(s2) != len(s3):
            return False
        if not s1 and s2 == s3:
            return True
        if not s2 and s1 == s3:
            return True

        dp = [[True] * (len(s1)+1) for i in range(len(s2)+1)]

        def dfs(idx, l, r):
            if idx == len(s3):
                return True

            if l < len(s1) and s1[l] == s3[idx] and dp[r][l]:
                if dfs(idx+1, l+1, r):
                    return True
            if r < len(s2) and s2[r] == s3[idx] and dp[r][l]:
                if dfs(idx+1, l, r+1):
                    return True
            
            dp[r][l] = False

            return False
        
        return dfs(0, 0, 0)