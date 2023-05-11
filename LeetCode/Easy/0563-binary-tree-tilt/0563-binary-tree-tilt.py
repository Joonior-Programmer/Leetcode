# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTilt(self, root: Optional[TreeNode]) -> int:
        self.ret = 0
        def DFS(node):

            if not node:
                return 0

            left = DFS(node.left)
            right = DFS(node.right)

            self.ret += abs(left - right)

            return left + right + node.val

        DFS(root)
        
        return self.ret