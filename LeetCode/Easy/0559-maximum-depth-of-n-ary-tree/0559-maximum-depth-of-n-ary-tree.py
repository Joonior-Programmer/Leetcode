"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def maxDepth(self, root: 'Node') -> int:
        if not root:
            return 0
        
        def dfs(node, curr):
            curr += 1
            ret = curr
            
            for v in node.children:
                ret = max(ret, dfs(v, curr))
                
            return ret
        
        return dfs(root, 0)