class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        count = defaultdict(int)
        
        for v in arr:
            count[v] += 1
        
        for v in arr:
            if count[v] == 1:
                k -= 1
                if not k:
                    return v
        
        return ""