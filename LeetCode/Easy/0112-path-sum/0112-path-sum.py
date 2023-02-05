# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False

        def DFS(node, sum):
            if node and not node.left and not node.right and sum + node.val == targetSum:
                return True
            elif not node:
                return False
            return DFS(node.left, sum + node.val) or DFS(node.right, sum + node.val)
            
        return DFS(root, 0)