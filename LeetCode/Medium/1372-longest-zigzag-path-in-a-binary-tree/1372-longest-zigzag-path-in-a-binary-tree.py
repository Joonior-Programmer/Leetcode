# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def longestZigZag(self, root: Optional[TreeNode]) -> int:
        ret = 0
        
        def DFS(node, left, right):
            
            if not node:
                return
            
            nonlocal ret
            
            ret = max(ret, max(left, right))
            
            DFS(node.left, right + 1, 0)
            DFS(node.right, 0, left + 1)
        
        DFS(root, 0, 0)
        
        return ret
