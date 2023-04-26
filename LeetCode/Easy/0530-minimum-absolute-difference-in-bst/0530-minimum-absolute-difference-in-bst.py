# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        prev, ret = float("-inf"), float("inf")
        def DFS(node):
            nonlocal prev, ret
            if not node:
                return
            DFS(node.left)
            if node.val - prev < ret:
                ret = node.val - prev
            prev = node.val
            DFS(node.right)
        DFS(root)
        return ret
