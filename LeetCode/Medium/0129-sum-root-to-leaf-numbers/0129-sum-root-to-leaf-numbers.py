# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        def dfs(node, sum_num):
            if not node:
                return 0
            ret = 0
            ret += dfs(node.left, sum_num * 10 + node.val)
            ret += dfs(node.right, sum_num * 10 + node.val)
            if not ret:
                return sum_num * 10 + node.val
            return ret

        return dfs(root, 0)