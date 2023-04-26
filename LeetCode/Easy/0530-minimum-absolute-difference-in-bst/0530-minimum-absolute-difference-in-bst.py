# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        vals = []
        def DFS(node):
            if not node:
                return
            vals.append(node.val)
            DFS(node.left)
            DFS(node.right)
        DFS(root)
        vals.sort()
        ret = float("inf")
        for i in range(len(vals) - 1, 0, -1):
            ret = min(ret, vals[i] - vals[i-1])
        return ret