# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        exist = set()
        
        def dfs(node):
            if not node:
                return False

            if k - node.val in exist:
                return True
            
            exist.add(node.val)
            
            if dfs(node.left):
                return True
            if dfs(node.right):
                return True
            return False 
        
        return dfs(root)