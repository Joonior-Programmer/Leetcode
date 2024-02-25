# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumRootToLeaf(self, root: Optional[TreeNode]) -> int:
        def dfs(node, curr):
            if not node.left and not node.right:
                return curr * 2 + node.val
            
            ret = 0
            curr = curr * 2 + node.val
            
            if node.left:
                ret += dfs(node.left, curr)

            if node.right:
                ret += dfs(node.right, curr)
            
            return ret
        
        return dfs(root, 0)