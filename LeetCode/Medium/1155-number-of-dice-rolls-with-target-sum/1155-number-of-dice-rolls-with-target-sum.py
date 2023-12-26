class Solution:
    def numRollsToTarget(self, n: int, k: int, target: int) -> int:
        memo = defaultdict(int)
        
        def dfs(remain, left):
            if left == 0:
                if remain == 0:
                    return 1
                return 0
            
            if not remain:
                return 0
            
            if (remain, left) in memo:
                return memo[(remain,left)]
            
            count = 0
            
            for i in range(1, k + 1):
                count += dfs(remain - 1, left - i)
                
            memo[(remain, left)] = count % (10 ** 9 + 7)
            return count % (10 ** 9 + 7)
            
        return dfs(n, target)