# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findBottomLeftValue(self, root: Optional[TreeNode]) -> int:
        ret = [0]
        depth = [0]
        
        def dfs(node, d):
            if not node:
                return
            
            if d > depth[0]:
                depth[0] = d
                ret[0] = node.val
            
            dfs(node.left, d+1)
            dfs(node.right, d+1)
            
        dfs(root, 1)
        
        return ret[0]
            
            