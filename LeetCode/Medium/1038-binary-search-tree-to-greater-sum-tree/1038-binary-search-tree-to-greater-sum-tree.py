# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def bstToGst(self, root: TreeNode) -> TreeNode:
        curr = [0]
        def dfs(node):
            if not node:
                return
            
            dfs(node.right)
            curr[0] += node.val
            node.val = curr[0]
            dfs(node.left)
        
        dfs(root)
        
        return root