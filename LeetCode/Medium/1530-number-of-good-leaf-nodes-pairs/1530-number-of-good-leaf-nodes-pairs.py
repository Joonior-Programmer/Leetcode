# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def countPairs(self, root: TreeNode, distance: int) -> int:
        ret = [0]
        
        def dfs(node):
            if not node:
                return []
            
            l = dfs(node.left)
            r = dfs(node.right)
            
            if not l and not r:
                return [1]
            
            for v0 in l:
                if v0 >= distance:
                    continue
                    
                for v1 in r:
                    if v0 + v1 <= distance:
                        ret[0] += 1
            
            return [v + 1 for v in l + r]
        
        dfs(root)
        
        return ret[0]
        
        