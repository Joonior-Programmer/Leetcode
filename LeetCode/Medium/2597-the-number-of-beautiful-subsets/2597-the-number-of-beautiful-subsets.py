class Solution:
    def beautifulSubsets(self, nums: List[int], k: int) -> int:
        n = len(nums)
        ret = [0]
        
        def dfs(idx, count):
            if idx == n:
                return

            if not count[nums[idx] - k] and not count[nums[idx] + k]:
                ret[0] += 1
                count[nums[idx]] += 1

                dfs(idx + 1, count)
                count[nums[idx]] -= 1
                dfs(idx + 1, count)
                
            else:
                dfs(idx + 1, count)
        
        dfs(0, defaultdict(int))

        return ret[0]