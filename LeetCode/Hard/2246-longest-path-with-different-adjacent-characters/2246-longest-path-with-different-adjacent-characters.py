class Solution:
    result = 0
    def longestPath(self, parent: List[int], s: str) -> int:
        tree = [[] for i in range(len(parent))]
        
        for i in range(1, len(parent)):
            tree[parent[i]].append(i)
        
        def DFS(current):
            max1 = 0
            max2 = 0
            for v in tree[current]:
                temp = DFS(v)
                if s[v] == s[current]: continue
                if temp > max1:
                    max2 = max1
                    max1 = temp
                elif temp > max2:
                    max2 = temp    
            
            self.result = max(self.result, max1 + max2 + 1)
            return max1 + 1

        DFS(0)

        return self.result